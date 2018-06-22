package Controller;

import Command.ICommand;

public class ControllerOfWindows extends Controller{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Window is open!");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Window is close!");
	}
	public void setCommand(ICommand command){
		this.iCommand = command;
	}
	public void runCommand(){
		this.iCommand.execute();
	}
}
