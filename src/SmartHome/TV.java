package SmartHome;

public class TV extends Module{
	private boolean open = true;

	public TV (SmartHome home) {
		super(home);
		// TODO Auto-generated constructor stub
	}
	public void addTV(){
		System.out.println("Add a TV in my smart home!");
	}
	public void setSmartHome(){
		addTV();
	}
	public String actOpen(){
		if(this.open == false)
			this.open = true;
		return "TV is open!\n";
	}
	public String actClose(){
		if(this.open == true)
			this.open = false;
		return "TV is close!\n";
	}


}