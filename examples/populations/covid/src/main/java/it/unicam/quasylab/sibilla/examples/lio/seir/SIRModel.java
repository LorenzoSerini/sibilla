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
package it.unicam.quasylab.sibilla.examples.lio.seir;

import it.unicam.quasylab.sibilla.core.models.ParametricDataSet;
import it.unicam.quasylab.sibilla.core.models.pm.PopulationModelDefinition;
import it.unicam.quasylab.sibilla.core.models.pm.PopulationState;
import it.unicam.quasylab.sibilla.core.simulator.SimulationEnvironment;
import it.unicam.quasylab.sibilla.core.simulator.sampling.SamplingCollection;
import it.unicam.quasylab.sibilla.core.simulator.sampling.SummaryStatisticSampling;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

/**
 * @author loreti
 *
 */
public class SIRModel  {

	public final static int SAMPLINGS = 120;
	public final static double DEADLINE = 120;
	private static final int REPLICA = 10;

	public static void main(String[] argv) throws FileNotFoundException, InterruptedException, UnknownHostException {
		PopulationModelDefinition def = new PopulationModelDefinition(
				SIRModelDefinition::createPopulationRegistry,
				SIRModelDefinition::generateRules,
				(ee,pr) -> ParametricDataSet.newStateSet(rg -> SIRModelDefinition.geneateState())
		);
		SimulationEnvironment simulator = new SimulationEnvironment();
		SamplingCollection<PopulationState> collection = new SamplingCollection<>();
		collection.add(SummaryStatisticSampling.measure("S",SAMPLINGS,DEADLINE, s -> s.getFraction(SIRModelDefinition.S)));
		collection.add(SummaryStatisticSampling.measure("I",SAMPLINGS,DEADLINE,s -> s.getFraction(SIRModelDefinition.I)));
		collection.add(SummaryStatisticSampling.measure("R",SAMPLINGS,DEADLINE,s -> s.getFraction(SIRModelDefinition.R)));
		simulator.simulate(def.createModel(),def.state(),collection::getSamplingHandler,REPLICA,DEADLINE);
		collection.printTimeSeries("data","sir_",".data");
	}



}
