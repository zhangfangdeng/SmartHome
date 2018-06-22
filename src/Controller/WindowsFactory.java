package Controller;

public class WindowsFactory extends ControllerFactory {

	@Override
	public Controller getContrller() {
		// TODO Auto-generated method stub
		return new ControllerOfWindows();
	}

}
