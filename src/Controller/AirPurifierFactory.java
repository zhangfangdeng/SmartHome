package Controller;

public class AirPurifierFactory extends ControllerFactory{

	@Override
	public Controller getContrller() {
		// TODO Auto-generated method stub
		return new ControllerOfAirPurifier();
	}

}
