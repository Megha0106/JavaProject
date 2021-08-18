import java.awt.*;
import javax.swing.*;

public class Demo extends JFrame {
	static Save s=new Save();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.setVisible(true);
		Button b=new Button("Save");
		d.add(b);
		
		b.addActionListener(s);

	}

}
