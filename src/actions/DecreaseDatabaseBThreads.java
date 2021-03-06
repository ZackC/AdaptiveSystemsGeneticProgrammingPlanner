package actions;

import org.jgap.InvalidConfigurationException;
import org.jgap.gp.impl.GPConfiguration;

public class DecreaseDatabaseBThreads extends Actions {

	final int responseChange = 1;
	final int threadChange = -2;
	final double failureRate = 0.2;
	final GPConfiguration gpConf;

	public DecreaseDatabaseBThreads(GPConfiguration gpConf)
			throws InvalidConfigurationException {
		super(gpConf);
		this.timeToPeformAction = 180;
		this.gpConf = gpConf;
	}

	@Override
	public Object clone() {
		try {
			return new DecreaseDatabaseBThreads(gpConf);
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean arePreconditionsSatisfied(CostRewardObject cr) {
		return !(cr.getSystemState().getDatabaseBThreadCount() < 3);
	}

	@Override
	public void results(CostRewardObject cr) {
		cr.getSystemState().setDatabaseBThreadCount(
				cr.getSystemState().getDatabaseBThreadCount() + threadChange);
		cr.systemResponseTime = cr.systemResponseTime + responseChange;

	}

	@Override
	public String toString() {
		return "decreaseDatabaseBThreads";
	}

	@Override
	public int getTime() {
		return timeToPeformAction;
	}

	@Override
	public String getPrismSucessString() {
		String result = "(clockTime'=clockTime+"
				+ String.valueOf(timeToPeformAction) + ")"
				+ "&(responseTime'= responseTime-" + Math.abs(responseChange) + ")"
				+ "&(cost'=cost)" + "&(serverCount'= serverCount)"
				+ "&(contentQuality'=contentQuality)";
		return result;
	}

	@Override
	public String getPrismFailureString() {
		String result = "(clockTime'=clockTime+"
				+ String.valueOf(timeToPeformAction) + ")"
				+ "&(responseTime'= responseTime)" + "&(cost'=cost)"
				+ "&(serverCount'= serverCount)" + "&(contentQuality'=contentQuality)";
		return result;
	}

	@Override
	public double getFailureRate() {
		return failureRate;
	}
}
