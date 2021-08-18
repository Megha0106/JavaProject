
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;


public class NewAccount extends JFrame implements KeyListener,ActionListener{
	//components of the form
	JLabel error,back,title,accNo,name,dob,gender,balance,fatherName,motherName,mblNo,adharNo,address,tehsil,district,state,pincode;
	JTextField tAccNo,tName,tBalance,tFatherName,tMotherName,tMblNo,tAdharNo,tTehsil,tDistrict,tState,tPincode;
	JTextArea tAddress;
	JRadioButton male,female;
	ButtonGroup genderGrp;
	JComboBox date,month,year;
	JButton create,reset;
	
	private String dates[]={"1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31"};
	private String months[]={
			"Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec"
	};
	private String years[]={
			"1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" ,"2020"	
	};
	
	//constructor to initialize constructor
	NewAccount(){
		//setting frame
		setTitle("New Account");
		setBounds(200,100,800,800);
		setLayout(null);
		ImageIcon img=new ImageIcon("newaccback3.jpg");
		back=new JLabel("",img,JLabel.CENTER);
		back.setBounds(0,0,800,800);
		add(back);
		
		Font font1=new Font("Arial",Font.PLAIN,20);
		
		error=new JLabel();
		error.setForeground(Color.red);
		error.setBounds(300,650,300,25);
		error.setFont(font1);
		back.add(error);
		
		//initialize components
		title=new JLabel("Account Opening Form");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial",Font.BOLD,25));
		title.setBounds(300,20,300,25);
		back.add(title);
		
		
		
		accNo = new JLabel("Account No:");
		accNo.setBounds(200,60,200,30);
		accNo.setFont(font1);		
		back.add(accNo);
		tAccNo = new JTextField();
		tAccNo.setBounds(335,60,300,30);
		tAccNo.setFont(font1);
		tAccNo.addKeyListener(this); //Restriction to numbers only
		add(tAccNo);
		
		name= new JLabel("Name:");
		name.setBounds(200,100,200,30);
		name.setFont(font1);
		back.add(name);
		tName = new JTextField();
		tName.setBounds(335,100,300,30);
		tName.setFont(font1);
		add(tName);
		
		dob=new JLabel("Date of Birth:");
		dob.setBounds(200,140,200,30);
		dob.setFont(font1);
		back.add(dob);
		
		date=new JComboBox(dates);
		date.setBounds(335,140,50,30);
		date.setFont(font1);
		back.add(date);
		
		month = new JComboBox(months);
		month.setBounds(390,140,70,30);
		month.setFont(font1);
		back.add(month);
		
		year=new JComboBox(years);
		year.setBounds(470,140,70,30);
		year.setFont(font1);
		back.add(year);
		
		gender = new JLabel("Gender:");
		gender.setBounds(200,180,200,30);
		gender.setFont(font1);
		back.add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(335,180,100,30);
		male.setFont(font1);
		male.setSelected(true);
		male.setContentAreaFilled(false);
		back.add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450,180,100,30);
		female.setFont(font1);
		female.setContentAreaFilled(false);
		female.setSelected(false);
		back.add(female);
		
		genderGrp = new ButtonGroup();
		genderGrp.add(male);
		genderGrp.add(female);
		
		balance = new JLabel("Initial Balance:");
		balance.setBounds(200,220,200,30);
		balance.setFont(font1);
		back.add(balance);
		
		tBalance = new JTextField();
		tBalance.setBounds(335,220,300,30);
		tBalance.setFont(font1);
		tBalance.addKeyListener(this);
		back.add(tBalance);
		
		fatherName = new JLabel("Father's Name:");
		fatherName.setBounds(200,260,200,30);
		fatherName.setFont(font1);
		back.add(fatherName);
		
		tFatherName = new JTextField();
		tFatherName.setBounds(335,260,300,30);
		tFatherName.setFont(font1);
		back.add(tFatherName);
		
		motherName = new JLabel("Mother's Name:");
		motherName.setBounds(200,300,200,30);
		motherName.setFont(font1);
		back.add(motherName);
		
		tMotherName = new JTextField();
		tMotherName.setBounds(335,300,300,30);
		tMotherName.setFont(font1);
		back.add(tMotherName);
		
		mblNo = new JLabel("Mobile No:");
		mblNo.setBounds(200,340,200,30);
		mblNo.setFont(font1); 
		back.add(mblNo);
		
		tMblNo = new JTextField();
		tMblNo.setBounds(335,340,300,30);
		tMblNo.setFont(font1);
		tMblNo.addKeyListener(this);
		back.add(tMblNo);
		
		adharNo = new JLabel("Adhar No:");
		adharNo.setBounds(200,380,200,30);
		adharNo.setFont(font1);
		back.add(adharNo);
		
		tAdharNo = new JTextField();
		tAdharNo.setBounds(335,380,300,30);
		tAdharNo.setFont(font1);
		tAdharNo.addKeyListener(this);
		back.add(tAdharNo);
		
		address = new JLabel("Address:");
		address.setBounds(200,420,200,30);
		address.setFont(font1);
		back.add(address);
		
		tAddress = new JTextArea();
		tAddress.setBounds(335,420,300,50);
		tAddress.setFont(font1);
		tAddress.setLineWrap(true);
		back.add(tAddress);
		
		tehsil = new JLabel("Tehsil:");
		tehsil.setBounds(200,480,200,30);
		tehsil.setFont(font1);
		back.add(tehsil);
		
		tTehsil = new JTextField();
		tTehsil.setBounds(335,480,300,30);
		tTehsil.setFont(font1);
		back.add(tTehsil);
		
		district = new JLabel("District:");
		district.setBounds(200,520,200,30);
		district.setFont(font1);
		back.add(district);
		
		tDistrict = new JTextField();
		tDistrict.setBounds(335,520,300,30);
		tDistrict.setFont(font1);
		back.add(tDistrict);
		
		state = new JLabel("State:");
		state.setBounds(200,560,200,30);
		state.setFont(font1);
		back.add(state);
		
		tState = new JTextField();
		tState.setBounds(335,560,300,30);
		tState.setFont(font1);
		back.add(tState);
		
		pincode = new JLabel("Pincode:");
		pincode.setBounds(200,600,200,30);
		pincode.setFont(font1);
		back.add(pincode);
		
		tPincode = new JTextField();
		tPincode.setBounds(335,600,300,30);
		tPincode.setFont(font1);
		tPincode.addKeyListener(this);
		back.add(tPincode);
		
		create = new JButton("Create Account");
		create.setBounds(220,680,200,30);
		create.setFont(font1);
		back.add(create);
		
		reset = new JButton("Reset");
		reset.setBounds(450,680,200,30);
		reset.setFont(font1);
		back.add(reset);
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tAccNo || e.getSource()==tBalance || e.getSource()==tMblNo || e.getSource()==tAdharNo || e.getSource()==tPincode ){
			//restriction for integers only
			if((e.getKeyChar()>='0' && e.getKeyChar()<='9') || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
			{
				((JTextComponent) e.getSource()).setEditable(true);
				error.setText("");
				
			}
			else{
				((JTextComponent) e.getSource()).setEditable(false);
				
				error.setText("Enter numbers only");
			}
		}
		
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	//handling button events
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
