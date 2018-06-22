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
		public String AirPurifierOpen(){
			if(apctrcon == false)
				return "ERROR!Air purifier is not contributed!\n";
			else{
				ICommand iCommandAirOpen = new ConcreteCommandOpen(airPurifier);
				iCommandAirOpen.execute();
				return "Air purifier is open!\n";
			}
		}
		public String AirPurifierClose(){
			if(apctrcon == false)
				return "ERROR!Air purifier is not contributed!\n";
			else{
				ICommand iCommandAirClose = new ConcreteCommandClose(airPurifier);
				iCommandAirClose.execute();
				return "Air purifier is close!\n";
			}
		}
		public String WindowsOpen(){
			if(winctrcon == false)
				return "ERROR!Window is not contributed!\n";
			else{
			ICommand iCommandWinOpen = new ConcreteCommandOpen(window);
			iCommandWinOpen.execute();
			return "Window is open!\n";
			}
		}
		public String TVOpen(){
			if(tvctrcon == false)
				return "ERROR!TV is not contributed!\n";
			else{
			ICommand iCommandTVOpen = new ConcreteCommandOpen(this.tv);
			iCommandTVOpen.execute();
			return "TV is open!\n";
			}
		}
		public String WindowsClose(){
			if(winctrcon == false)
				return "ERROR!Window is not contributed!\n";
			else{
			ICommand iCommandWinClose = new ConcreteCommandClose(window);
			iCommandWinClose.execute();
			return "Window is close!\n";
			}
		}
		public String TVClose(){
			if(tvctrcon == false)
				return "ERROR!TV is not contributed!\n";
			else{
			ICommand iCommandTVClose = new ConcreteCommandClose(this.tv);
			iCommandTVClose.execute();
			return "TV is close!\n";
			}
		}
	
	}


