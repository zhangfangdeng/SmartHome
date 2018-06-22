package SmartHome;

public class MySmartHome extends SmartHome{
	private int pm2point5 = 0;
	@Override
	public void setSmartHome() {
		System.out.println("Contribute My Smart Home!");
		
	}
	public void setPm2point5(int pm){
		this.pm2point5 = pm;
	}
	public int getPm2point5(){
		return this.pm2point5;
	}
}
