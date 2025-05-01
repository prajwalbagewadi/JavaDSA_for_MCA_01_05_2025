package helloSwingpack;

import javax.swing.*;
import java.awt.event.*;
public class LoginPage extends JFrame implements ActionListener{
	JLabel uname,passwd;
	JTextField user;
	JPasswordField pass;
	JButton sub;
	public LoginPage(){
		this.setTitle("Login");
		uname=new JLabel("Username");
		uname.setBounds(50,50,100,30);
		user=new JTextField();
		user.setBounds(150,50,150,30);
		passwd=new JLabel("Password");
		passwd.setBounds(50,100,100,30);
		pass=new JPasswordField();
		pass.setBounds(150,100,150,30);
		sub=new JButton("Submit");
		sub.addActionListener(this);
		sub.setBounds(50,150,100,30);
		this.add(uname);
		this.add(user);
		this.add(passwd);
		this.add(pass);
		this.add(sub);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==sub){
			String username=user.getText();
			String password=new String(pass.getPassword());
			if(username.equals("admin") && password.equals("123")){
				JOptionPane.showMessageDialog(this,"login successful");
			}
			else{
				JOptionPane.showMessageDialog(this,"login unsuccessful");
			}
			
		}
	}
	public static void main(String[] args){
		new LoginPage();
	}
}
