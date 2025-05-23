package bank.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Withdrawl extends JFrame implements ActionListener{
	
	String pin;
	
	TextField textfield;
	
	JButton b1, b2;
	
	Withdrawl(String pin){
		this.pin = pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1550, 830);
		add(l3);
		
		JLabel label1 = new JLabel("MAXIMUM WITHDRAWL IS RS.10,000");
		label1.setForeground(Color.white);
		label1.setFont(new Font("System", Font.BOLD, 16));
		label1.setBounds(460, 180, 700, 35);
		l3.add(label1);
		
		JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
		label2.setForeground(Color.white);
		label2.setFont(new Font("System", Font.BOLD, 16));
		label2.setBounds(460, 220, 400, 35);
		l3.add(label2);
		
		textfield = new TextField();
		textfield.setBackground(new Color(65, 125, 128));
		textfield.setForeground(Color.white);
		textfield.setBounds(460, 260, 320, 25);
		textfield.setFont(new Font("Raleway", Font.BOLD, 22));
		l3.add(textfield);
		
		b1 = new JButton("WITHDRAW");
		b1.setBounds(700, 362, 150, 35);
		b1.setBackground(new Color(65, 125, 128));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("BACK");
		b2.setBounds(700, 406, 150, 35);
		b2.setBackground(new Color(65, 125, 128));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		l3.add(b2);
		
		
		setLayout(null);
		setSize(1550, 1080);
		setLocation(0, 0);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			try {
				String amount = textfield.getText();
				Date date = new Date();
				if(textfield.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "Please enter the amount you want to withdrawl");
				} else {
					Connect c = new Connect();
					ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
					int balance = 0;
					while(resultSet.next()) {
						if(resultSet.getString("type").equals("Deposit")) {
							balance += Integer.parseInt(resultSet.getString("amount"));
						} else {
							balance -= Integer.parseInt(resultSet.getString("amount"));
						}
					}
					if(balance < Integer.parseInt(amount)) {
						JOptionPane.showMessageDialog(null, "Insufficient Balance");
						return;
					}
					
					c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
					JOptionPane.showMessageDialog(null, "Debited Successfully");
					setVisible(false);
					new Main_Class(pin);
				}
			} catch(Exception E) {
				
			}
		} else if(e.getSource() == b2) {
			setVisible(false);
			new Main_Class(pin);
		}
		
	}


	public static void main(String agr[]) {
		new Withdrawl("");
	}
	
}
