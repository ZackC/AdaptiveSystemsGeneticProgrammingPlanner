package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerC;

public class ShutdownServerC extends ShutdownServer {

	public ShutdownServerC(){
		latency=30;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "ShutdownServerC";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerC.class);
		
	}
	


}
