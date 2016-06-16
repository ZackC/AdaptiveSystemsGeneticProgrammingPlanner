package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerF;

public class ShutdownServerF extends ShutdownServer {

	public ShutdownServerF(){
		latency=30;
		failureWeight=0.1;
	}
	
	@Override
	public String toString(){
	 	return "ShutdownServerF";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerF.class);
		
	}
	


}
