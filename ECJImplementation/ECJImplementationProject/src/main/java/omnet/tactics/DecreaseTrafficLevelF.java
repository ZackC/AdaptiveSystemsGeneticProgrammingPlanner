package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerF;

public class DecreaseTrafficLevelF extends DecreaseTrafficLevel {

	public DecreaseTrafficLevelF(){
		latency=5;
		failureWeight=0.01;
	}
	
	@Override
	public String toString(){
	 	return "DecreaseTrafficLevelF";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerF.class);
		
	}
	


}
