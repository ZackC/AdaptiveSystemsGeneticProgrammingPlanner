package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerD;

public class ShutdownServerD extends ShutdownServer {

	public ShutdownServerD(){
		latency=30;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "ShutdownServerD";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerD.class);
		
	}
	


}
