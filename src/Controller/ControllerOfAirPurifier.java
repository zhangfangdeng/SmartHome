package Controller;

import Command.ICommand;

public class ControllerOfAirPurifier extends Controller {
	
	
	public void setCommand(ICommand command){
		this.iCommand = command;
	}
	public String runCommand(){
		return this.iCommand.execute();
	}
}
