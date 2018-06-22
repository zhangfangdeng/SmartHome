package Command;

import SmartHome.Module;

public class ConcreteCommandClose extends ICommand{
	private Module module;
	public ConcreteCommandClose(Module module){
		this.module = module;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.module.actClose();
		
	}

}
