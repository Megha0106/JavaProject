import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;
public class SecondFrame {
	
	JFrame f=new JFrame("Second");
	JTextField txt=new JTextField();
	
	SecondFrame(){
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(txt);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Myfile.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			txt.setText(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setVisible(true);
		f.setSize(200,200);
	}

}
