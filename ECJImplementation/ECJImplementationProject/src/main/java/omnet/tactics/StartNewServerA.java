package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerA;

public class StartNewServerA extends StartNewServer {

	public StartNewServerA(){
		latency = 120;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "StartNewServerA";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerA.class);
		
	}


	

}

