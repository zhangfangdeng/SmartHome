package SmartHome;

public class Module extends SmartHome{
	protected SmartHome mySmartHome;
	
	public Module(SmartHome home){
		super();
		this.mySmartHome = home;
	}

	@Override
	public void setSmartHome() {
		// TODO Auto-generated method stub
		mySmartHome.setSmartHome();
		
	}
	public void actOpen(){
		//System.out.println("Module open!");
	}
	public void actClose(){
		//System.out.println("Module close!");
	}

	@Override
	public void setPm2point5(int pm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPm2point5() {
		// TODO Auto-generated method stub
		return 0;
	}
}
