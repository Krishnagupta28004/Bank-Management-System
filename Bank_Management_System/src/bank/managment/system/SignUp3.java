package bank.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUp3  extends JFrame implements ActionListener{
	
	JRadioButton a1, a2, a3, a4;
	
	JCheckBox s1, s2, s3, s4, s5, s6;
	
	JButton submit, cancel;
	
	String formno;
	
	SignUp3(String formno){
		
		this.formno = formno;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		JLabel l1 = new JLabel("Page 3");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel l2 = new JLabel("Account Details :");
		l2.setFont(new Font("Raleway", Font.BOLD, 22));
		l2.setBounds(280, 70, 400, 40);
		add(l2);
		
		JLabel l3 = new JLabel("Form No : ");
		l3.setFont(new Font("Raleway", Font.BOLD, 14));
		l3.setBounds(700, 10, 100, 30);
		add(l3);
		
		JLabel l4 = new JLabel(formno);
		l4.setFont(new Font("Raleway", Font.BOLD, 14));
		l4.setBounds(760, 10, 60, 30);
		add(l4);
		
		// for account type
				JLabel labelAcc = new JLabel("Account Type :");
				labelAcc.setFont(new Font("Raleway", Font.BOLD, 18));
				labelAcc.setBounds(100, 140, 200, 30);
				add(labelAcc);
				
				a1 = new JRadioButton("Saving Account");
				a1.setFont(new Font("Raleway", Font.BOLD, 16));
				a1.setBackground(new Color(215, 252, 252));
				a1.setBounds(100, 180, 150, 30);
				add(a1);
				
				a2 = new JRadioButton("Fixed Deposit");
				a2.setFont(new Font("Raleway", Font.BOLD, 16));
				a2.setBackground(new Color(215, 252, 252));
				a2.setBounds(350, 180, 150, 30);
				add(a2);
				
				a3 = new JRadioButton("Current Account");
				a3.setFont(new Font("Raleway", Font.BOLD, 16));
				a3.setBackground(new Color(215, 252, 252));
				a3.setBounds(100, 220, 180, 30);
				add(a3);
				
				a4 = new JRadioButton("Recurring Deposit");
				a4.setFont(new Font("Raleway", Font.BOLD, 16));
				a4.setBackground(new Color(215, 252, 252));
				a4.setBounds(350, 220, 180, 30);
				add(a4);
				
				ButtonGroup buttonGroup = new ButtonGroup();
				buttonGroup.add(a1);
				buttonGroup.add(a2);
				buttonGroup.add(a3);
				buttonGroup.add(a4);
		
		// for card number
				JLabel labelCard = new JLabel("Card Number :");
				labelCard.setFont(new Font("Raleway", Font.BOLD, 18));
				labelCard.setBounds(100, 300, 200, 30);
				add(labelCard);
				
				JLabel labelCno = new JLabel("( Your 16-digit Card Number : )");
				labelCno.setFont(new Font("Raleway", Font.BOLD, 12));
				labelCno.setBounds(100, 330, 300, 30);
				add(labelCno);
				
				JLabel labelNo = new JLabel("XXXX-XXXX-XXXX-4841");
				labelNo.setFont(new Font("Raleway", Font.BOLD, 18));
				labelNo.setBounds(330, 300, 250, 30);
				add(labelNo);
				
				JLabel labelAppear = new JLabel("( It would appear on ATM Card / Cheque Book and Statements )");
				labelAppear.setFont(new Font("Raleway", Font.BOLD, 12));
				labelAppear.setBounds(330, 330, 500, 30);
				add(labelAppear);
				
		// for pin number
				JLabel labelPin = new JLabel("PIN :");
				labelPin.setFont(new Font("Raleway", Font.BOLD, 18));
				labelPin.setBounds(100, 370, 200, 30);
				add(labelPin);
				
				JLabel labelPno = new JLabel("XXXX");
				labelPno.setFont(new Font("Raleway", Font.BOLD, 18));
				labelPno.setBounds(330, 370, 200, 30);
				add(labelPno);
				
				JLabel labelPass = new JLabel("( 4-digit Password )");
				labelPass.setFont(new Font("Raleway", Font.BOLD, 12));
				labelPass.setBounds(100, 400, 200, 30);
				add(labelPass);
				
		// for services required
				JLabel labelService = new JLabel("Service Required :");
				labelService.setFont(new Font("Raleway", Font.BOLD, 18));
				labelService.setBounds(100, 450, 200, 30);
				add(labelService);
				
				s1 = new JCheckBox("ATM Card");
				s1.setBackground(new Color(215, 252, 252));
				s1.setFont(new Font("Raleway", Font.BOLD, 16));
				s1.setBounds(100, 500, 200, 30);
				add(s1);
				
				s2 = new JCheckBox("Internet Banking");
				s2.setBackground(new Color(215, 252, 252));
				s2.setFont(new Font("Raleway", Font.BOLD, 16));
				s2.setBounds(350, 500, 200, 30);
				add(s2);
				
				s3 = new JCheckBox("Mobile Banking");
				s3.setBackground(new Color(215, 252, 252));
				s3.setFont(new Font("Raleway", Font.BOLD, 16));
				s3.setBounds(100, 550, 200, 30);
				add(s3);
				
				s4 = new JCheckBox("Email Alert");
				s4.setBackground(new Color(215, 252, 252));
				s4.setFont(new Font("Raleway", Font.BOLD, 16));
				s4.setBounds(350, 550, 200, 30);
				add(s4);
				
				s5 = new JCheckBox("Cheque Book");
				s5.setBackground(new Color(215, 252, 252));
				s5.setFont(new Font("Raleway", Font.BOLD, 16));
				s5.setBounds(100, 600, 200, 30);
				add(s5);
				
				s6 = new JCheckBox("E-Statement");
				s6.setBackground(new Color(215, 252, 252));
				s6.setFont(new Font("Raleway", Font.BOLD, 16));
				s6.setBounds(350, 600, 200, 30);
				add(s6);
				
				JCheckBox s7 = new JCheckBox("I hereby declare that the above entered details is correct to the best of my knowledge.", true);
				s7.setBackground(new Color(215, 252, 252));
				s7.setFont(new Font("Raleway", Font.BOLD, 12));
				s7.setBounds(100, 680, 600, 20);
				add(s7);
				
		// submit and cancel button
		submit = new JButton("Submit");
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(250, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setBounds(420, 720, 100, 30);
		cancel.addActionListener(this);
		add(cancel);
				
		getContentPane().setBackground(new Color(215, 252, 252));
		setSize(850, 800);
		setLayout(null);
		setLocation(400,20);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String atype = null;
		if(a1.isSelected()) {
			atype = "Saving Account";
		} else if(a2.isSelected()) {
			atype = "Fixed Deposit";
		} else if(a3.isSelected()) {
			atype = "Current Account";
		} else if(a4.isSelected()) {
			atype = "Recurring Deposit";
		}
		
		Random ran = new Random();
		long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
		String cardno = "" + Math.abs(first7);

		long first3 = (ran.nextLong() % 9000L) + 1000L;
		String pin = "" + Math.abs(first3);
		
		String fac = "";
		if(s1.isSelected()) {
			fac += "ATM Card";
		} else if(s2.isSelected()) {
			fac += "Internet Banking";
		} else if(s3.isSelected()) {
			fac += "Mobile Banking";
		} else if(s4.isSelected()) {
			fac += "Email Alert";
		} else if(s5.isSelected()) {
			fac += "Cheque Book";
		} else if(s6.isSelected()) {
			fac += "E-Statement";
		}
		
		try {
			if(e.getSource() == submit) {
				if(atype.equals("")) {
					JOptionPane.showMessageDialog(null, "Fill all the fields");
				} else {
					Connect c1 = new Connect();
					String q1 = "insert into signupthree values('"+formno+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
					String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
					c1.statement.executeUpdate(q1);
					c1.statement.executeUpdate(q2);
					JOptionPane.showMessageDialog(null, "Card Number : "+cardno+ "\n Pin : "+pin);
					new Deposit(pin);
					setVisible(false);
				}
			} else if(e.getSource() == cancel) {
				System.exit(0);
			}
			
		} catch (Exception E) {
			E.printStackTrace();
		}
	}



	public static void main(String arg[]) {
		new SignUp3("");
	}
}
