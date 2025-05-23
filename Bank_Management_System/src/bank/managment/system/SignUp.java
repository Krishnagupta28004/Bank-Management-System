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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3, m1, m2, m3;
	
	JButton next;
	
	JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState, textCountry;
	JDateChooser dateChooser;
	
	Random ran = new Random();
	long first4 = (ran.nextLong()% 9000L) + 1000L;
	String first = " " + Math.abs(first4);
	
	SignUp(){
		super("APPLICATION FORM");
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);	// we can not directly put ImageIcon so we use the JLable
		image.setBounds(25,10,100,100);
		add(image);
		
		JLabel label1 = new JLabel("APPLICATION FORM NO."+ first4);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("Raleway", Font.BOLD, 38));
		add(label1);
		
		JLabel label2 = new JLabel("Page 1");
		label2.setFont(new Font("Raleway", Font.BOLD, 22));
		label2.setBounds(330, 70, 600, 30);
		add(label2);
		
		JLabel label3 = new JLabel("Personal Details");
		label3.setFont(new Font("Raleway", Font.BOLD, 22));
		label3.setBounds(290, 90, 600, 30);
		add(label3);
		
		
		
		// for name
				JLabel labelName = new JLabel("Name  :");
				labelName.setFont(new Font("Raleway", Font.BOLD, 20));
				labelName.setBounds(100, 190, 100, 30);
				add(labelName);
				
				textName = new JTextField();
				textName.setFont(new Font("Raleway", Font.BOLD, 14));
				textName.setBounds(300, 190, 400, 30);
				add(textName);
		
		// for father's name
				JLabel labelfName = new JLabel("Father's Name :");
				labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
				labelfName.setBounds(100, 240, 200, 30);
				add(labelfName);
				
				textFname = new JTextField();
				textFname.setFont(new Font("Raleway", Font.BOLD, 14));
				textFname.setBounds(300, 240, 400, 30);
				add(textFname);
		
		// for date of birth
				JLabel DOB = new JLabel("Date Of Birth :");
				DOB.setFont(new Font("Raleway", Font.BOLD, 20));
				DOB.setBounds(100, 340, 200, 30);
				add(DOB);
				
				dateChooser = new JDateChooser();
				dateChooser.setForeground(new Color(105, 105, 105));
				dateChooser.setBounds(300, 340, 400, 30);
				add(dateChooser);
		
		// for gender
				JLabel labelG = new JLabel("Gender :");
				labelG.setFont(new Font("Raleway", Font.BOLD, 20));
				labelG.setBounds(100, 290, 200, 30);
				add(labelG);
				
				r1 = new JRadioButton("Male");
				r1.setFont(new Font("Raleway", Font.BOLD, 14));
				r1.setBackground(new Color(222, 255, 228));
				r1.setBounds(300, 290, 60, 30);
				add(r1);
				
				r2 = new JRadioButton("Female");
				r2.setFont(new Font("Raleway", Font.BOLD, 14));
				r2.setBackground(new Color(222, 255, 228));
				r2.setBounds(450, 290, 90, 30);
				add(r2);
				
				r3 = new JRadioButton("Others");
				r3.setFont(new Font("Raleway", Font.BOLD, 14));
				r3.setBackground(new Color(222, 255, 228));
				r3.setBounds(600, 290, 90, 30);
				add(r3);
				
				ButtonGroup buttonGroup = new ButtonGroup();
				buttonGroup.add(r1);
				buttonGroup.add(r2);
				buttonGroup.add(r3);
		
		// for email address
				JLabel labelEmail = new JLabel("Email address :");
				labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
				labelEmail.setBounds(100, 390, 200, 30);
				add(labelEmail);
				
				textEmail = new JTextField();
				textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
				textEmail.setBounds(300, 390, 400, 30);
				add(textEmail);
		
		// for married status
				JLabel labelMs = new JLabel("Marital Status :");
				labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
				labelMs.setBounds(100, 440, 200, 30);
				add(labelMs);
				
				m1 = new JRadioButton("Single");
				m1.setFont(new Font("Raleway", Font.BOLD, 14));
				m1.setBackground(new Color(222, 255, 228));
				m1.setBounds(300, 440, 90, 30);
				add(m1);
				
				m2 = new JRadioButton("Married");
				m2.setFont(new Font("Raleway", Font.BOLD, 14));
				m2.setBackground(new Color(222, 255, 228));
				m2.setBounds(450, 440, 90, 30);
				add(m2);
				
				m3 = new JRadioButton("Divorce");
				m3.setFont(new Font("Raleway", Font.BOLD, 14));
				m3.setBackground(new Color(222, 255, 228));
				m3.setBounds(600, 440, 90, 30);
				add(m3);
				
				ButtonGroup buttonMs = new ButtonGroup();
				buttonMs.add(m1);
				buttonMs.add(m2);
				buttonMs.add(m3);
		
		// for address
				JLabel labelAdd = new JLabel("Address :");
				labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
				labelAdd.setBounds(100, 490, 200, 30);
				add(labelAdd);
				
				textAdd = new JTextField();
				textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
				textAdd.setBounds(300, 490, 400, 30);
				add(textAdd);
		
		// for city
				JLabel labelCity = new JLabel("City :");
				labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
				labelCity.setBounds(100, 540, 200, 30);
				add(labelCity);
				
				textCity = new JTextField();
				textCity.setFont(new Font("Raleway", Font.BOLD, 14));
				textCity.setBounds(300, 540, 400, 30);
				add(textCity);
		
		// for pincode
				JLabel labelPin = new JLabel("Pincode :");
				labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
				labelPin.setBounds(100, 590, 200, 30);
				add(labelPin);
				
				textPin = new JTextField();
				textPin.setFont(new Font("Raleway", Font.BOLD, 14));
				textPin.setBounds(300, 590, 400, 30);
				add(textPin);
				
		// for state
				JLabel labelState = new JLabel("State :");
				labelState.setFont(new Font("Raleway", Font.BOLD, 20));
				labelState.setBounds(100, 640, 200, 30);
				add(labelState);
				
				textState = new JTextField();
				textState.setFont(new Font("Raleway", Font.BOLD, 14));
				textState.setBounds(300, 640, 400, 30);
				add(textState);
		
		// for country
				JLabel labelCountry = new JLabel("Country :");
				labelCountry.setFont(new Font("Raleway", Font.BOLD, 20));
				labelCountry.setBounds(100, 690, 200, 30);
				add(labelCountry);
				
				textCountry = new JTextField();
				textCountry.setFont(new Font("Raleway", Font.BOLD, 14));
				textCountry.setBounds(300, 690, 400, 30);
				add(textCountry);
		
		next = new JButton("Next");
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setBounds(620, 730, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formno = first;
		String name = textName.getText();
		String fname = textFname.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		String gender = null;
		if(r1.isSelected()) {
			gender = "Male";
		} else if(r2.isSelected()) {
			gender = "Female";
		} else if(r3.isSelected()) {
			gender = "Other";
		}
		
		String email = textEmail.getText();
		
		String marital = null;
		if(m1.isSelected()) {
			marital = "Single";
		} else if(m2.isSelected()) {
			marital = "Married";
		} else if(m3.isSelected()) {
			marital = "Divorce";
		}
		
		String address = textAdd.getText();
		String city = textCity.getText();
		String pincode = textPin.getText();
		String state = textState.getText();
		String country = textCountry.getText();
		
		try {
			if(textName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the feilds");
			} else {
				Connect connect1 = new Connect();
				String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"', '"+country+"')";
				connect1.statement.executeUpdate(q);
				new SignUp2(formno);
				setVisible(false);
			}
			
		} catch(Exception E) {
			E.printStackTrace();
		}
		
	}



	public static void main(String arg[]) {
		new SignUp();
	}
}
