package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerF;

public class StartNewServerF extends StartNewServer {

	public StartNewServerF(){
		latency=240;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "StartNewServerF";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerF.class);
		
	}


	

}

