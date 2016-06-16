package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerG;

public class ShutdownServerG extends ShutdownServer {

	public ShutdownServerG(){
		latency=30;
		failureWeight=0.1;
	}
	
	
	@Override
	public String toString(){
	 	return "ShutdownServerG";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerG.class);
		
	}
	


}
