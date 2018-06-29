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
	
	public String actOpen(){
		if(this.open == false)
			this.open = true;
		return "AirPurifier is open!\n";
	}
	public String actClose(){
		if(this.open == true)
			this.open = false;
		return "AirPurifier is close!\n";
	}


}
