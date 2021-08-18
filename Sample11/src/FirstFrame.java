import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;

public class FirstFrame {

	JFrame f=new JFrame("Firts");
	JButton btn=new JButton("Next");
	
	FirstFrame(){
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(btn);
		
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Myfile.txt",true)));
					pw.println("Hello");
					pw.close();
					f.dispose();
					new SecondFrame();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		f.setVisible(true);
		f.setSize(200,200);
	}
}
