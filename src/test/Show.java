package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Show {
	test test = new test();
	String data = "";
	public static void main(String[] args){
		Show show =new Show();
		show.gui();
	}
	public void gui(){

		JFrame f = new JFrame("智能家居模拟系统");
		Container contentPane = f.getContentPane();  
		f.setSize(700, 500);
		f.setLocation(200, 200);
	    f.setLayout(null);
	    JLabel name = new JLabel("智能家居模拟");
	    name.setForeground(Color.black);
	    name.setBounds(70, 20, 180, 30);
	    f.add(name);

	    
        JCheckBox AirCheckBox = new JCheckBox("Air");

        AirCheckBox.setSelected(true);
        AirCheckBox.setBounds(50, 50, 130, 30);
        JCheckBox AirPurifierCheckBox = new JCheckBox("Air purifier");
        AirPurifierCheckBox.setBounds(50, 90, 130, 30);
        JCheckBox TVCheckBox = new JCheckBox("TV");
        TVCheckBox.setBounds(50, 130, 130, 30);
        JCheckBox WindowsCheckBox = new JCheckBox("Window");
        WindowsCheckBox.setBounds(50, 170, 130, 30);
        
        AirPurifierCheckBox.isSelected();

        f.add(AirCheckBox);
        f.add(AirPurifierCheckBox);
        f.add(TVCheckBox);
        f.add(WindowsCheckBox);
        
	    JLabel bn = new JLabel("确认组成SmartHome:");
	    bn.setForeground(Color.black);
	    bn.setBounds(50, 210, 180, 30);
	    f.add(bn);

        JButton b1 = new JButton("确认");
        b1.setBounds(70, 250, 70, 30);
        JButton b2 = new JButton("取消");
        b2.setBounds(160, 250, 70, 30);
        f.add(b1);
        f.add(b2);
 
	    JLabel name1 = new JLabel("智能家居模拟控制器");
	    name1.setForeground(Color.black);
	    name1.setBounds(420, 20, 300, 30);
	    f.add(name1);
	    
	    JLabel lName = new JLabel("当前pm2.5：");
        lName .setBounds(400, 50, 80, 30);
        JTextField tfName = new JTextField("");
        tfName.setText("");
        tfName.setBounds(470, 50, 80, 30);
        tfName.setPreferredSize(new Dimension(80, 30));
        f.add(lName);
        f.add(tfName);
        
        JButton in = new JButton("确定");
        in.setBounds(580, 50, 70, 30);
        f.add(in);
        
	    JLabel apName = new JLabel("Air purifier：");
        apName .setBounds(400, 120, 80, 30);
        JButton apo = new JButton("打开");
        apo.setBounds(480, 120, 70, 30);
        JButton apc = new JButton("关闭");
        apc.setBounds(560, 120, 70, 30);
        f.add(apName);
        f.add(apo);
        f.add(apc);
        
	    JLabel tvName = new JLabel("TV：");
        tvName .setBounds(400, 185, 80, 30);
        JButton tvo = new JButton("打开");
        tvo.setBounds(480, 185, 70, 30);
        JButton tvc = new JButton("关闭");
        tvc.setBounds(560, 185, 70, 30);
        f.add(tvName);
        f.add(tvo);
        f.add(tvc);
        
	    JLabel winName = new JLabel("Window：");
        winName .setBounds(400, 250, 80, 30);
        JButton wino = new JButton("打开");
        wino.setBounds(480, 250, 70, 30);
        JButton winc = new JButton("关闭");
        winc.setBounds(560, 250, 70, 30);
        f.add(winName);
        f.add(wino);
        f.add(winc);
        

        JTextArea text = new JTextArea();
        JScrollPane jsp = new JScrollPane(text);
        jsp.setBounds(30, 300, 640, 150);
        f.add(jsp);
        
        
        f.setLocationRelativeTo(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	    
	    //确认键响应函数
	    b1.addActionListener(new ActionListener(){
	 	public void actionPerformed(ActionEvent e) {
	    contributeSmartHome(AirCheckBox.isSelected(),AirPurifierCheckBox.isSelected(),WindowsCheckBox.isSelected(),TVCheckBox.isSelected(),text);
	    contributeController(AirPurifierCheckBox.isSelected(),WindowsCheckBox.isSelected(),TVCheckBox.isSelected(),text);
	    	}
	    });
	    b2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		data += "Cancel\n";
	    		text.setText(data);
	    	}
	    });
	    
	    apo.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		AirPurifierOpen(text);
	    	}
	    });
	    apc.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		AirPurifierClose(text);
	    	}
	    });
	    wino.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		WindowsOpen(text);
	    	}
	    });
	    winc.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		WindowsClose(text);
	    	}
	    });
	    tvo.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		TVOpen(text);
	    	}
	    });
	    tvc.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		TVClose(text);
	    	}
	    });
	    
	    in.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		if(Integer.parseInt(tfName.getText())>250){
	    			data+="空气质量很差，需要打开空气净化器和关闭窗户！\n";
	    			AirPurifierOpen(text);
	    			WindowsClose(text);
	    		}else{
	    			data += "空气质量好，打开窗户和关闭空气净化器！\n";
	    			WindowsOpen(text);
	    			AirPurifierClose(text);
	    		}
	    	}
	    });
	}


	public void contributeController(boolean ap,boolean win,boolean tv,JTextArea text) {
		 test.contributeController(ap, win, tv);        
		 data += "----------Contribute my smart home-------------\n";
	     if(ap)
	         data+="Air purifier controller is contributed!\n";
	     if(win)
	    	 data+="Window controller is contributed!\n";
	     if(tv)
	    	 data+="TV controller is contributed!\n";
	     text.setText(data);
	}

	public void contributeSmartHome(boolean air,boolean ap,boolean win,boolean tv,JTextArea text) {
		 test.contributeSmartHome(air, ap, win, tv);  
		 data += "----------Contribute module controller-------------\n";
		 if(air)
			 data += "Air is contributed!\r\n";
	     if(ap)
	         data+="Air purifier is contributed!\n";
	     if(win)
	    	 data+="Window is contributed!\n";
	     if(tv)
	    	 data+="TV is contributed!\n";
	     text.setText(data);
	}
	
	public void AirPurifierOpen(JTextArea text){
		data += test.AirPurifierOpen();
		text.setText(data);
		
	}
	public void AirPurifierClose(JTextArea text){
		data+=test.AirPurifierClose();
		text.setText(data);
		
	}
	public void WindowsOpen(JTextArea text){

		data+=test.WindowsOpen();
		text.setText(data);
		
	}
	public void WindowsClose(JTextArea text){
		
		data+=test.WindowsClose();
		text.setText(data);
	}
	public void TVOpen(JTextArea text){
		data+=test.TVOpen();
		text.setText(data);
		
	}
	public void TVClose(JTextArea text){	
		data+=test.TVClose();
		text.setText(data);
		
	}
}


		



