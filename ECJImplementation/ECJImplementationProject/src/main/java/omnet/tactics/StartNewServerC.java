package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerC;

public class StartNewServerC extends StartNewServer {

	public StartNewServerC(){
		latency=120;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "StartNewServerC";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerC.class);
		
	}


	

}

