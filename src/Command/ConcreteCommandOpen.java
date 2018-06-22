package Command;

import SmartHome.Module;

public class ConcreteCommandOpen extends ICommand{
	private Module module;
	public ConcreteCommandOpen(Module module){
		this.module = module;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.module.actOpen();
		
	}

}
