package Controller;

import Command.ICommand;

public class ControllerOfWindows extends Controller{

	public void setCommand(ICommand command){
		this.iCommand = command;
	}
	public String runCommand(){
		return this.iCommand.execute();
	}
}
