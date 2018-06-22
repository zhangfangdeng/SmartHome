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
	public void actOpen(){
		if(this.open == false)
			this.open = true;
		System.out.println("TV is open!");
	}
	public void actClose(){
		if(this.open == true)
			this.open = false;
		System.out.println("TV is close!");
	}


}