package tests;

import actions.FailableTactic;
import actions.operators.ForOperator;
import actions.operators.SequenceOperator;
import ec.EvolutionState;
import ec.Evolve;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import ec.gp.GPTree;
import ec.util.ParameterDatabase;
import main.OmnetStateData;
import main.SingleObjectiveProblem;
import omnet.tactics.ShutdownServerA;
import omnet.tactics.StartNewServerA;

public class TestFailableTactic {

	public static void main(String[] args){
			OmnetStateData sd = new OmnetStateData();
			sd.initializeState();
			GPIndividual ind = new GPIndividual();
			GPTree[] treeInit = {new GPTree()};
			ind.trees = treeInit;
			GPNode root = new SequenceOperator();
			GPNode[] childs = {new ShutdownServerA(), new ShutdownServerA()};
			root.children = childs;
			ind.trees[0].child = root;
			Evolve ev = new Evolve();
			String[] inputFile = {"-file","selfadaptivesystemsingleobjective.params"};
			ParameterDatabase params = ev.loadParameterDatabase(inputFile);
			EvolutionState state = ev.initialize(params,0);
			((GPIndividual)ind).trees[0].child.eval(state, 0, (GPData)sd, new ADFStack(), 
					((GPIndividual)ind), new SingleObjectiveProblem());

			System.out.println(((FailableTactic)childs[0]).hasActionSucceeded());
			System.out.println(((FailableTactic)childs[1]).hasActionSucceeded());
	}
}
