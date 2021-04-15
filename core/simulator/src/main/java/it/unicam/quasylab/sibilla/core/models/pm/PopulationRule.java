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
/**
 * 
 */
package it.unicam.quasylab.sibilla.core.models.pm;

import org.apache.commons.math3.random.RandomGenerator;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author loreti
 *
 */
public interface PopulationRule extends Serializable {
	/**
	 * 
	 * 
	 * @param r
	 * @param state
	 * @return null if the rule cannot be applied.
	 */
	PopulationTransition apply( RandomGenerator r , double now, PopulationState state );


	static Function<PopulationState,Double> fractionOf(int idx) {
		return s -> s.getFraction(idx);
	}

	static Function<PopulationState,Double> numberOf(int idx) {
		return s -> s.getOccupancy(idx);
	}

	static Function<PopulationState,Double> apply(
			Function<PopulationState,Double> f1,
			Function<PopulationState,Double> f2,
			BiFunction<Double,Double,Double> op) {
		return s-> op.apply(f1.apply(s),f2.apply(s));
	}
}
