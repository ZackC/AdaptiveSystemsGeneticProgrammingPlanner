package omnet.components;


public class ServerA extends OmnetComponent{
	
	public ServerA(){
		super();
		costPerSecond = 0.5;
		normalRequestsHandledPerSecond = 50;
		dimmedRequestsHandledPerSecond = 150;
		
	}

}
