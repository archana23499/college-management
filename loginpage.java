import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class loginpage implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JComboBox c;
	TextField t2, t3;
	JLabel l1, l2, l3;
	JButton b1, b2;


	loginpage()
	{
		f1 = new JFrame("Login Page");
		p1 = new JPanel();
		t3 = new TextField();
		t2 = new TextField();
		b1 = new JButton("Login");
		b2 = new JButton ("Reset");
		l1 = new JLabel ("UserId");
		l2 = new JLabel("Username");
		l3 = new JLabel ("Password");
		c = new JComboBox();
		
		f1.add(p1);
		p1.add(t3);
		p1.add(t2);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(b1);
		p1.add(b2);
		p1.add(c);
		
		c.addItem("Admin");
		c.addItem("Student");
		c.addItem("Instructor");

		t2.setBounds(225, 125, 125, 25);
		t3.setBounds(225, 200, 125, 25);
		l1.setBounds(50, 50, 125, 25);
		l2.setBounds(50, 125, 125, 25);
		l3.setBounds(50, 200, 125, 25);
		b1.setBounds(75, 275, 100, 50);
		b2.setBounds(225, 275, 100, 50);
		c.setBounds(225, 50, 125, 25);

		t3.setEchoChar('#');
		

		p1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(400, 400);
		f1.setLocationRelativeTo(null);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public void actionPerformed (ActionEvent ae)
	{
		String s1 = c.getSelectedItem().toString();
		String s2 = t2.getText();
		String s3 = t3.getText();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		if(ae.getSource()==b1)
		{
			if(s1.equalsIgnoreCase("Admin") && s2.equalsIgnoreCase("Admin") && s3.equals("ADMIN"))
			{
				JOptionPane.showMessageDialog(f1,"Admin login success");
                                home hh=new home();
			}
			
			else if (s1.equalsIgnoreCase("Student") && s2.equalsIgnoreCase("Akhil") && s3.equals("123"))
			{
				JOptionPane.showMessageDialog(f1,"Student login success");
                                home hh=new home();
			}
			else if (s1.equalsIgnoreCase("Instructor") && s2.equalsIgnoreCase("Sharad") && s3.equals("789"))
			{
				JOptionPane.showMessageDialog(f1,"Staff login success");
                                home hh=new home();
			}
			else
			{
				JOptionPane.showMessageDialog(f1,"Login Failed");
			}
		}

		if(ae.getSource()==b2)
		{
			t2.setText("");
			t3.setText("");
		}
	}

	public static void main(String arg[])
	{
		loginpage obj = new loginpage();
	}

}