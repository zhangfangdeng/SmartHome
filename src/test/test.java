package test;

import java.util.Scanner;

import Command.ConcreteCommandClose;
import Command.ConcreteCommandOpen;
import Command.ICommand;
import Controller.AirPurifierFactory;
import Controller.Controller;
import Controller.TVFactory;
import Controller.WindowsFactory;
import SmartHome.Air;
import SmartHome.AirPurifier;
import SmartHome.Module;
import SmartHome.MySmartHome;
import SmartHome.SmartHome;
import SmartHome.TV;
import SmartHome.Windows;

public class test {
		private SmartHome mySmartHome;
		private boolean ismshcon = false;
		private Module module;
		private AirPurifier airPurifier;
		private boolean isapcon = false;
		private Windows window;
		private boolean iswincon = false;
		private Air air;
		private TV tv;
		private boolean istvcon = false;
		
		private Controller airPurifierController;
		private boolean apctrcon = false;
		private Controller windowsController;
		private boolean winctrcon = false;
		private Controller tvController;
		private boolean tvctrcon = false;
		
		public void contributeSmartHome(boolean air,boolean ap,boolean win,boolean tv){
			if(air){
				this.mySmartHome = new MySmartHome();
				this.air = new Air(mySmartHome);
				this.ismshcon = true;
			}
			this.module = new Module(mySmartHome);
			if(ap){
				this.airPurifier = new AirPurifier(mySmartHome);
				this.isapcon = true;
			}
			if(win){
				this.window = new Windows(mySmartHome);
				this.iswincon = true;
				}
			if(tv){
				this.tv = new TV(mySmartHome);
				this.istvcon = true;
				}

		mySmartHome.setPm2point5(500);
		}
		
		public void contributeController(boolean ap,boolean win,boolean tv){
			if(ap){
				AirPurifierFactory airPurifierFactory = new AirPurifierFactory();
				this.airPurifierController = airPurifierFactory.getContrller();
				this.apctrcon = true;
			}
			if(win){
				WindowsFactory windowsFactory = new WindowsFactory();
				this.windowsController = windowsFactory.getContrller();
				this.winctrcon = true;
			}
			if(tv){
				TVFactory tvFactory = new TVFactory();
				this.tvController = tvFactory.getContrller();
				this.tvctrcon = true;
			}
		}

		public String AirPurifierControl(String control){
			if(apctrcon == false)
				return "ERROR!Air purifier is not contributed!\n";
			else{
				ICommand iCommandAirControl = null;
				if(control.equals("open")){
					iCommandAirControl = new ConcreteCommandOpen(airPurifier);
				}
				if(control.equals("close")){
					iCommandAirControl = new ConcreteCommandClose(airPurifier);
				}
				airPurifierController.setCommand(iCommandAirControl);
				return airPurifierController.runCommand();	
			}
		}
		public String WindowsControl(String control){
			if(winctrcon == false)
				return "ERROR!Window is not contributed!\n";
			else{
				ICommand iCommandWindowsControl = null;
				if(control.equals("open")){
					iCommandWindowsControl = new ConcreteCommandOpen(window);
				}
				if(control.equals("close")){
					iCommandWindowsControl = new ConcreteCommandClose(window);
				}
				windowsController.setCommand(iCommandWindowsControl);
				return windowsController.runCommand();	
			}
		}
		public String TVControl(String control){
			if(tvctrcon == false)
				return "ERROR!TV is not contributed!\n";
			else{
				ICommand iCommandTVControl = null;
				if(control.equals("open")){
					iCommandTVControl = new ConcreteCommandOpen(tv);
				}
				if(control.equals("close")){
					iCommandTVControl = new ConcreteCommandClose(tv);
				}
				windowsController.setCommand(iCommandTVControl);
				return windowsController.runCommand();	
			}
		}
		
	}


