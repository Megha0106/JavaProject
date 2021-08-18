import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
public class Save extends Applet implements ActionListener{
	TextField txt;
	public void init(){
		txt=new TextField();
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		add(txt);
		txt.setText("Button pressed");
	}

}
