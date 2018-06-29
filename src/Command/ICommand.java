package Command;

import SmartHome.Module;

public abstract class ICommand {
	protected Module module;
	public abstract String execute();
}
