package main.java.actions;

import main.java.main.StateData;

public abstract class AddServer extends ActionTemplate{


    
	@Override
	protected boolean areAddingItem() {
		return true;
	}
    
    abstract protected boolean isInvalidChange(StateData sd);
    
    public String toString(){
    	return "AddServer";
    }
}

