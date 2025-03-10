/*
 * Sibilla:  a Java framework designed to support analysis of Collective
 * Adaptive Systems.
 *
 *             Copyright (C) 2020.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *            http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package it.unicam.quasylab.sibilla.core.simulator;

import it.unicam.quasylab.sibilla.core.models.SimulatorCursor;
import it.unicam.quasylab.sibilla.core.models.State;
import it.unicam.quasylab.sibilla.core.models.TimeStep;
import it.unicam.quasylab.sibilla.core.simulator.sampling.SamplingHandler;
import org.apache.commons.math3.random.RandomGenerator;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * @author loreti
 *
 */
public class SimulationTask<S extends State> implements Supplier<Long>, Serializable {

	private static final long serialVersionUID = -504798938865475892L;

	private final RandomGenerator random;
	private final SimulationUnit<S> unit;
	private SimulationStatus status;
	private long startTime = 0, elapsedTime = 0;

	private final int index;

	public SimulationTask(RandomGenerator random , SimulationUnit<S> unit) {
		this(-1,random,unit);
	}

	public SimulationTask(int index, RandomGenerator random , SimulationUnit<S> unit) {
		this.random = random;
		this.unit = unit;
		this.status = SimulationStatus.INIT;
		this.index = index;
	}

	public void reset(){
		status = SimulationStatus.INIT;
		startTime = 0;
		elapsedTime = 0;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public Long get() {
		running();
		long start = System.currentTimeMillis();
		SamplingHandler<S> handler = this.unit.getSamplingHandler();
		SimulatorCursor<S> cursor = this.unit.getSimulationCursor(this.random);
		cursor.start();
		handler.start();
		handler.sample(cursor.time(), cursor.currentState());
		while (!unit.getStoppingPredicate().test(cursor.time(),cursor.currentState())&&(!isCancelled())) {
			step(handler, cursor);
		}
		handler.end(cursor.time());
		completed(true);
		return System.currentTimeMillis()-start;
	}
	
	private synchronized void running() {
		startTime = System.nanoTime();
		if (!isCancelled()) {
			this.status = SimulationStatus.RUNNING;
		}
		
	}

	private synchronized void completed(boolean b) {
		if (this.status != SimulationStatus.CANCELLED) {
			this.status = SimulationStatus.COMPLETED;
		}
		elapsedTime = System.nanoTime() - startTime;
	}

	private void step(SamplingHandler<S> handler, SimulatorCursor<S> cursor) {
		if (cursor.step()) {
			handler.sample(cursor.time(), cursor.currentState());
		} else {
			cancel();
		}
	}

	public synchronized void cancel() {
		if (!this.isCompleted()) {
			this.status = SimulationStatus.CANCELLED; 			
		}
	}

	public synchronized boolean isCompleted() {
		return this.status == SimulationStatus.COMPLETED;
	}

	public synchronized boolean isRunning() {
		return this.status == SimulationStatus.RUNNING;
	}

	public synchronized boolean isCancelled() {
		return (this.status==SimulationStatus.CANCELLED);
	}

	public long getElapsedTime(){
		return elapsedTime;
	}

	public SimulationUnit<S> getUnit() {
		return unit;
	}
}
