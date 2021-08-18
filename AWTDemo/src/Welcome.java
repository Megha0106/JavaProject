
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Welcome extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome frame=new Welcome();
		frame.setLayout(null);
		frame.setSize(2000,1000);
		frame.setTitle("Online Bank");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//background image
		ImageIcon img=new ImageIcon("back.jpg");
		JLabel background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,2000,1000);
		frame.add(background);
		
		frame.setVisible(true);
		new Login();
				

	}

}
