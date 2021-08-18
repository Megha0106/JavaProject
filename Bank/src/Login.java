import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Login frame = new Login();
		frame.setTitle("MSS Bank");
		frame.setBounds(500,300,700,400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//background Image
		ImageIcon img = new ImageIcon("loginback.jpg");
		JLabel loginback = new JLabel("",img,JLabel.CENTER);
		loginback.setBounds(0,0,800,600);
		frame.add(loginback);
		
		//Login components
		Font myFont1=new Font("SansSerif", Font.BOLD, 25);
		Font myFont2=new Font("SansSerif", Font.ROMAN_BASELINE,20);
		
		JLabel label=new JLabel("Welocome to MSS Bank"); //welcome label
		ImageIcon loginimg =new ImageIcon("loginlogo.png"); //login image
		JLabel imgLabel= new JLabel("",loginimg,JLabel.CENTER);
		final JLabel invalid=new JLabel(); //display invalid login credential
		final JTextField uName=new JTextField(); //user name
		final JPasswordField password = new JPasswordField(); //password
		JButton login =new JButton("Login"); //login button
		
		//set welcome label
		label.setBounds(200,20,300,20);
		label.setFont(myFont1);
		label.setForeground(Color.white);
		//set login image
		imgLabel.setBounds(300,50,90,90); 
		//set invalid
		invalid.setBounds(250,140,250,30); 
		invalid.setFont(new Font("SansSerif",Font.PLAIN,20));
		invalid.setForeground(Color.red);
		//set username
		uName.setBounds(200,180,300,40); 
		uName.setFont(myFont2); 
		//set password
		password.setBounds(200,240,300,40); 
		password.setFont(myFont2);
		//set login button
		login.setBounds(280,300,150,40);
		login.setFont(myFont1);
		login.setBackground(Color.blue);
		login.setForeground(Color.white);
		login.setBorder(BorderFactory.createLineBorder(Color.white));
		
		//add components
		loginback.add(label);
		loginback.add(imgLabel);
		loginback.add(uName);
		loginback.add(password);
		loginback.add(login);
		loginback.add(invalid);
		
		//Login event handling
		login.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//validate user name and password 
				//String pass=new String(password.getPassword());
				//if(uName.getText().equals("mss@123")&& pass.equals("bank456") ){
					new HomeScreen();
					frame.dispose();
				//}
					
				//else{
					//invalid.setText("Invalid login credentials");
				//}
				
			}
			
		});
		
		frame.setVisible(true);
	}

}
