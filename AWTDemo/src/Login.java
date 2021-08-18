import javax.swing.*;
public class Login extends JFrame{
	
	JTextField uName;
	JTextField password;
	JButton login;
	
	Login(){
		uName=new JTextField();
		password=new JTextField();
		login=new JButton();
		
		setSize(800,500);
		setBounds(40,40,600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
