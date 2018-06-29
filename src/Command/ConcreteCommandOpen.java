package Command;

import SmartHome.Module;

public class ConcreteCommandOpen extends ICommand{

	public ConcreteCommandOpen(Module module){
		this.module = module;
	}
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return this.module.actOpen();
		
	}

}
