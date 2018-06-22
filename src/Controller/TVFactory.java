package Controller;

public class TVFactory extends ControllerFactory {

	@Override
	public Controller getContrller() {
		// TODO Auto-generated method stub
		return new ControllerOfTV();
	}

}
