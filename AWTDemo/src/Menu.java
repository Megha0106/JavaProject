import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends Frame{
	Button l;
	Menu(){
		l=new Button("Close");
		add(l);
		setVisible(true);
		l.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				
			}
			
		});
	}
	

}
