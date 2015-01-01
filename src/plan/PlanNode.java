package plan;

import java.util.Iterator;

import org.jgap.gp.CommandGene;

public abstract class PlanNode implements Iterable<PlanNode> {

	CommandGene planGene;
	PlanNode previousNode = null;

	public CommandGene getPlanGene() {
		return planGene;
	}

	public void setPlanGene(CommandGene planGene) {
		this.planGene = planGene;
	}

	public abstract String planString();

	public PlanNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(PlanNode previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public Iterator<PlanNode> iterator() {
		return new PlanNodeIterator(this);
	}

}
