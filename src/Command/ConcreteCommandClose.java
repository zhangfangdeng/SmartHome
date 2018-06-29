package Command;

import SmartHome.Module;

public class ConcreteCommandClose extends ICommand{
	public ConcreteCommandClose(Module module){
		this.module = module;
	}
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return this.module.actClose();
		
	}

}
