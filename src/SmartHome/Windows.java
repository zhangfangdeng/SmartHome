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
	public void actOpen(){
		if(this.open == false)
			this.open = true;
		System.out.println("Window is open!");
	}
	public void actClose(){
		if(this.open == true)
			this.open = false;
		System.out.println("Window is close!");
	}



}
