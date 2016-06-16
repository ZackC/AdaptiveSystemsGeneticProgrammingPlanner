package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerG;

public class StartNewServerG extends StartNewServer {

	public StartNewServerG(){
		latency=130;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "StartNewServerG";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerG.class);
		
	}


	

}

