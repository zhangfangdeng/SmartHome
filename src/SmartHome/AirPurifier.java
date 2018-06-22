package SmartHome;

public class AirPurifier extends Module{
	
	private boolean open = false;
	public AirPurifier(SmartHome home) {
		super(home);
		// TODO Auto-generated constructor stub
	}
	public void addAirPurifier(){
		System.out.println("Add an AirPurifier in my smart home!");
	}
	public void setSmartHome(){
		addAirPurifier();
	}
	
	public void actOpen(){
		if(this.open == false)
			this.open = true;
		System.out.println("AirPurifier is open!");
	}
	public void actClose(){
		if(this.open == true)
			this.open = false;
		System.out.println("AirPurifier is close!");
	}


}
