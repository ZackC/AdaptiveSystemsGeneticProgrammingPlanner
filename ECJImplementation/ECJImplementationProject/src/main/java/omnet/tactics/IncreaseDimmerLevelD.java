package omnet.tactics;

import main.OmnetStateData;
import omnet.components.ServerD;

public class IncreaseDimmerLevelD extends IncreaseDimmerLevel {

	public IncreaseDimmerLevelD(){
		latency=1;
		failureWeight=0.05;
	}
	
	@Override
	public String toString(){
	 	return "IncreaseDimmerLevelD";
	}

	@Override
	protected void callPerformTactic(OmnetStateData sd) {
		sd.performTactic(this, ServerD.class);
		
	}
	


}
