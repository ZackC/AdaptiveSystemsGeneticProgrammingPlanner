package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerA;

public class ShutdownServerA extends ShutdownServer {
	
	public ShutdownServerA(){
		latency=20;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "ShutdownServerA";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerA.class);
		
	}
	


}
