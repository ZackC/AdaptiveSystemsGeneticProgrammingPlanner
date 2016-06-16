package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerE;

public class StartNewServerE extends StartNewServer {

	public StartNewServerE(){
		latency=180;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "StartNewServerE";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerE.class);
		
	}


	

}

