package bank.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2 extends JFrame implements ActionListener{
	
	JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
	
	JTextField textPan, textAadhar;

	JRadioButton r1, r2, e1, e2;
	
	JButton next;
	
	String formno;
	
	SignUp2(String formno){
		
		super("APPLICATION FORM");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		this.formno = formno;
		
		JLabel l1 = new JLabel("Page 2");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setBounds(300, 30, 600, 40);
		add(l1);
		
		JLabel l2 = new JLabel("Additional Details");
		l2.setFont(new Font("Raleway", Font.BOLD, 22));
		l2.setBounds(300, 60, 600, 40);
		add(l2);
		
		JLabel l3 = new JLabel("Form No : ");
		l3.setFont(new Font("Raleway", Font.BOLD, 14));
		l3.setBounds(700, 10, 100, 30);
		add(l3);
		
		JLabel l4 = new JLabel(formno);
		l4.setFont(new Font("Raleway", Font.BOLD, 14));
		l4.setBounds(760, 10, 60, 30);
		add(l4);
		
		// for religion
				JLabel labelReligion = new JLabel("Religion :");
				labelReligion.setFont(new Font("Raleway", Font.BOLD, 18));
				labelReligion.setBounds(100, 120, 100, 30);
				add(labelReligion);
				
				String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
				comboBox = new JComboBox(religion);
				comboBox.setBackground(new Color(252, 208, 76));
				comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
				comboBox.setBounds(350, 120, 320, 30);
				add(comboBox);
		
		// for category
				JLabel labelCat = new JLabel("Category :");
				labelCat.setFont(new Font("Raleway", Font.BOLD, 18));
				labelCat.setBounds(100, 170, 100, 30);
				add(labelCat);
				
				String category[] = {"General", "OBC", "SC", "ST", "Other"};
				comboBox2 = new JComboBox(category);
				comboBox2.setBackground(new Color(252, 208, 76));
				comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
				comboBox2.setBounds(350, 170, 320, 30);
				add(comboBox2);
				
		// for income
				JLabel labelIncome = new JLabel("Income :");
				labelIncome.setFont(new Font("Raleway", Font.BOLD, 18));
				labelIncome.setBounds(100, 220, 100, 30);
				add(labelIncome);
				
				String income[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000", "Above 10,00,000"};
				comboBox3 = new JComboBox(income);
				comboBox3.setBackground(new Color(252, 208, 76));
				comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
				comboBox3.setBounds(350, 220, 320, 30);
				add(comboBox3);
				
		// for education
				JLabel labelEdu = new JLabel("Educational :");
				labelEdu.setFont(new Font("Raleway", Font.BOLD, 18));
				labelEdu.setBounds(100, 270, 150, 30);
				add(labelEdu);
				
				String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
				comboBox4 = new JComboBox(education);
				comboBox4.setBackground(new Color(252, 208, 76));
				comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
				comboBox4.setBounds(350, 270, 320, 30);
				add(comboBox4);
		
		// for occupation
				JLabel labelOccu = new JLabel("Occupation :");
				labelOccu.setFont(new Font("Raleway", Font.BOLD, 18));
				labelOccu.setBounds(100, 320, 150, 30);
				add(labelOccu);
				
				String occupation[] = {"Salaried", "Self-Employee", "Bussiness", "Student", "Retired", "Other"};
				comboBox5 = new JComboBox(occupation);
				comboBox5.setBackground(new Color(252, 208, 76));
				comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
				comboBox5.setBounds(350, 320, 320, 30);
				add(comboBox5);
		
		// for pan number
				JLabel labelPan = new JLabel("Pan Number :");
				labelPan.setFont(new Font("Raleway", Font.BOLD, 18));
				labelPan.setBounds(100, 370, 150, 30);
				add(labelPan);
				
				textPan = new JTextField();
				textPan.setFont(new Font("Raleway", Font.BOLD, 18));
				textPan.setBounds(350, 370, 320, 30);
				add(textPan);
		
		// for aadhaar number
				JLabel labelAadhar = new JLabel("Aadhaar Number :");
				labelAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
				labelAadhar.setBounds(100, 420, 160, 30);
				add(labelAadhar);
				
				textAadhar = new JTextField();
				textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
				textAadhar.setBounds(350, 420, 320, 30);
				add(textAadhar);
				
		// for senior citizen
				JLabel labelSenior = new JLabel("Senior Citizen :");
				labelSenior.setFont(new Font("Raleway", Font.BOLD, 18));
				labelSenior.setBounds(100, 470, 160, 30);
				add(labelSenior);
				 
				r1 = new JRadioButton("Yes");
				r1.setFont(new Font("Raleway", Font.BOLD, 14));
				r1.setBackground(new Color(252, 208, 76));
				r1.setBounds(350, 470, 100, 30);
				add(r1);
				
				r2 = new JRadioButton("No");
				r2.setFont(new Font("Raleway", Font.BOLD, 14));
				r2.setBackground(new Color(252, 208, 76));
				r2.setBounds(460, 470, 100, 30);
				add(r2);
				
		// asking for existing account
				JLabel labelEx = new JLabel("Existing Account :");
				labelEx.setFont(new Font("Raleway", Font.BOLD, 18));
				labelEx.setBounds(100, 520, 160, 30);
				add(labelEx);
				 
				e1 = new JRadioButton("Yes");
				e1.setFont(new Font("Raleway", Font.BOLD, 14));
				e1.setBackground(new Color(252, 208, 76));
				e1.setBounds(350, 520, 100, 30);
				add(e1);
				
				e2 = new JRadioButton("No");
				e2.setFont(new Font("Raleway", Font.BOLD, 14));
				e2.setBackground(new Color(252, 208, 76));
				e2.setBounds(460, 520, 100, 30);
				add(e2);
		
		// next button
		next = new JButton("Next");
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBackground(Color.white);
		next.setForeground(Color.black);
		next.setBounds(570, 640, 100, 30);
		next.addActionListener(this);
		add(next);
		
		setLayout(null);
		setSize(850, 750);
		setLocation(450, 80);
		getContentPane().setBackground(new Color(252, 208, 76));
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String rel = (String) comboBox.getSelectedItem();
		String cate = (String) comboBox2.getSelectedItem();
		String inc = (String) comboBox3.getSelectedItem();
		String edu = (String) comboBox4.getSelectedItem();
		String occ = (String) comboBox5.getSelectedItem();
		
		String pan = textPan.getText();
		String adhar = textAadhar.getText();
		
		String scitizen = " ";
		if(r1.isSelected()) {
			scitizen = "Yes";
		} else if(r2.isSelected()) {
			scitizen = "No";
		}
		
		String eAccount = " ";
		if(e1.isSelected()) {
			eAccount = "Yes";
		} else if(e2.isSelected()) {
			eAccount = "No";
		}
		
		try {
			if(textPan.getText().equals("") || textAadhar.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			} else {
				Connect c1 = new Connect();
				String q = "insert into signuptwo values ('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+adhar+"', '"+scitizen+"', '"+eAccount+"')";
				c1.statement.executeUpdate(q);
				new SignUp3(formno);
				setVisible(false);
			}
			
		} catch(Exception E) {
			E.printStackTrace();
			
		}
		
	}



	public static void main(String arg[]) {
		new SignUp2("");
	}
}
