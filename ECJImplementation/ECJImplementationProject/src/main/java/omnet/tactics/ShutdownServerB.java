package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerB;

public class ShutdownServerB extends ShutdownServer {

	public ShutdownServerB(){
		latency=20;
		failureWeight=0.1;
	}
	
	
	@Override
	public String toString(){
	 	return "ShutdownServerB";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerB.class);
		
	}
	


}
