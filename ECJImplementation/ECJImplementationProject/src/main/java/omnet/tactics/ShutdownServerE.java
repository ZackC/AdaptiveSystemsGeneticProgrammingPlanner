package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerE;

public class ShutdownServerE extends ShutdownServer {

	public ShutdownServerE(){
		latency=30;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "ShutdownServerE";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerE.class);
		
	}
	


}
