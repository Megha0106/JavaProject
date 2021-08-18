import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class HomeScreen extends JFrame implements ActionListener {
	
	JLabel backLabel;
	ImageIcon backImg;
	JMenuBar mb;
	JMenu bankingMenu,transMenu,infoMenu;
	JMenuItem newAcc,searchAcc,updateAcc,allAcc,deposite,withdraw,checkbal,history;
	
	HomeScreen(){
		setSize(2000,1000);
		setTitle("MSS Bank");
		//set background image
		backImg = new ImageIcon("back.jpg");
		backLabel =new JLabel("",backImg,JLabel.CENTER);
		backLabel.setBounds(0,0,2000,1000);
		add(backLabel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//set menu bar
		Font myFont1=new Font("SansSerif",Font.PLAIN,20);
		Font myFont2= new Font("SansSerif",Font.PLAIN,15);
		mb=new JMenuBar();
		//Banking menu
		bankingMenu = new JMenu("Banking");
		bankingMenu.setFont(myFont1);
		//menu items
		newAcc = new JMenuItem("New Account");
		newAcc.setFont(myFont2);
		searchAcc = new JMenuItem("Search Account");
		searchAcc.setFont(myFont2);
		updateAcc = new JMenuItem("Update Account");
		updateAcc.setFont(myFont2);
		allAcc = new JMenuItem("All Accounts");
		allAcc.setFont(myFont2);
		//adding items to menu
		bankingMenu.add(newAcc);
		bankingMenu.add(searchAcc);
		bankingMenu.add(updateAcc);
		bankingMenu.add(allAcc);
		
		//transaction menu
		transMenu = new JMenu("Trasaction");
		transMenu.setFont(myFont1);
		//menu items
		deposite= new JMenuItem("Deposite amount");
		deposite.setFont(myFont2);
		withdraw = new JMenuItem("Withdraw amount");
		withdraw.setFont(myFont2);
		//adding items to menu
		transMenu.add(deposite);
		transMenu.add(withdraw);
		
		//Account information menu
		infoMenu = new JMenu("Account Details");
		infoMenu.setFont(myFont1);
		//menu items
		checkbal = new JMenuItem("Check Balance");
		checkbal.setFont(myFont2);
		history = new JMenuItem("Transaction History");
		history.setFont(myFont2);
		//adding items to menu
		infoMenu.add(checkbal);
		infoMenu.add(history);
		//adding menus 
		mb.add(bankingMenu);
		mb.add(transMenu);
		mb.add(infoMenu);
		mb.setBounds(0,0,2000,40);
		
		backLabel.add(mb);
		//Event handling
		newAcc.addActionListener(this);
		searchAcc.addActionListener(this);
		updateAcc.addActionListener(this);
		allAcc.addActionListener(this);
		deposite.addActionListener(this);
		withdraw.addActionListener(this);
		checkbal.addActionListener(this);
		history.addActionListener(this);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==newAcc)
			new NewAccount();
		
	}

	
}
