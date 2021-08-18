import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
public class Home extends JFrame implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home frame= new Home();
		frame.setTitle("Home Screen");
		frame.setBounds(200,300,500,300);
		frame.setLayout(null);
		
		JButton next = new JButton("Next");
		next.setBounds(100,200,100,30);
		next.setBackground(Color.red);
		frame.add(next);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
