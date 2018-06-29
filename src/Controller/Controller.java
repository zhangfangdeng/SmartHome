package Controller;

import Command.ICommand;

public abstract class Controller {
	protected ICommand iCommand;
	public abstract void setCommand(ICommand command);
	public abstract String runCommand();
	
}
