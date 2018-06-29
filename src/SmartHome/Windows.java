package SmartHome;

public class Windows extends Module{
	private boolean open = false;
	public Windows (SmartHome home) {
		super(home);
		// TODO Auto-generated constructor stub
	}
	public void addWindows(){
		System.out.println("Add a window in my smart home!");
	}
	public void setSmartHome(){
		addWindows();
	}
	public String actOpen(){
		if(this.open == false)
			this.open = true;
		return "Window is open!\n";
	}
	public String actClose(){
		if(this.open == true)
			this.open = false;
		return "Window is close!\n";
	}



}
