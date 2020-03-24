import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class stdreg extends DBCON implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8, l9, l10;
	TextField t1,t2,t3,t6,t7,t8,t9;
	JComboBox c41, c42, c43, c5, c10;
	JButton b3,b1,b2;
 
	stdreg()
	{
		f1=new JFrame("Student Registration");
		p1=new JPanel();

		l1=new JLabel("Student Id");
		l2=new JLabel("Student Name");
		l3=new JLabel("Father's Name");
		l4=new JLabel("D.O.B.");
		l5=new JLabel("Gender");
		l6=new JLabel("Address");
		l7=new JLabel("Contact No.");
		l8=new JLabel("Password");
		l9=new JLabel("Confirm Pwrd");
		l10=new JLabel("Course");

		b3=new JButton("Back");
		b1=new JButton("Save");
		b2=new JButton("Reset");

		String str[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

		c41=new JComboBox();
		c42=new JComboBox(str);
		c43=new JComboBox();
		c5=new JComboBox();
		c10=new JComboBox();

		c10.addItem("Btech");
		c10.addItem("Mtech");


		c5.addItem("Male");
		c5.addItem("Female");

		
		for(int i=1; i<32; i++)
		{
			c41.addItem(i);
		}

		for(int i=1980; i<2018; i++)
		{
			c43.addItem(i);
		}

		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t6=new TextField();
		t7=new TextField();
		t8=new TextField();
                t9=new TextField();

		f1.add(p1);
		p1.add(l1); p1.add(l2); p1.add(l3);
		p1.add(l4); p1.add(l5); p1.add(l6);
		p1.add(l7); p1.add(l8); p1.add(l9);
		p1.add(l10);
		
		p1.add(b3); p1.add(b1); p1.add(b2);
		p1.add(c41); p1.add(c42); p1.add(c43);
		p1.add(c5); p1.add(c10);

		p1.add(t9); p1.add(t1); p1.add(t2);p1.add(t3);
		p1.add(t6); p1.add(t7); p1.add(t8);


		l1.setBounds(50, 25,150,25);
		l2.setBounds(50, 75,150,25);
		l3.setBounds(50,125,150,25);
		l4.setBounds(50,175,150,25);
		l5.setBounds(50,225,150,25);
		l6.setBounds(50,275,150,25);
		l7.setBounds(50,325,150,25);
		l8.setBounds(50,375,150,25);
		l9.setBounds(50,425,150,25);
		l10.setBounds(50,475,150,25);

		t1.setBounds(250,25,150,25);
		t2.setBounds(250,75,150,25);
		t3.setBounds(250,125,150,25);
		t6.setBounds(250,275,150,25);
		t7.setBounds(250,325,150,25);
		t8.setBounds(250,375,150,25);
		t9.setBounds(250,425,150,25);

		b3.setBounds(275,525,100,25);
		b1.setBounds(75,525,100,25);
		b2.setBounds(175,525,100,25);
		
		c41.setBounds(250, 175,50,25);
		c42.setBounds(300, 175,50,25);
		c43.setBounds(350, 175,50,25);
		c5.setBounds(250, 225,150,25);
		c10.setBounds(250, 475,150,25);

		
		t8.setEchoChar('*');
		t9.setEchoChar('*');	
	
		p1.setLayout(null);
		f1.setSize(450,625);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		p1.setLayout(null);
		f1.setResizable(false);

		b3.addActionListener(this);	
		b1.addActionListener(this);
		b2.addActionListener(this);
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			JOptionPane.showMessageDialog(f1, "button working");
                        
                        String str1=t1.getText();
                        String str2=t2.getText();
                        String str3=t3.getText();
                        
                        String sc41=c41.getSelectedItem().toString();
                        String sc42=c42.getSelectedItem().toString();
                        String sc43=c43.getSelectedItem().toString();
                        String dt=sc41+""+sc42+""+sc43;
                        String sc5=c5.getSelectedItem().toString();
                        String str6=t6.getText();
                        String str7=t7.getText();
                        String str8=t8.getText();
                        String str9=t9.getText();
                        String sc10=c10.getSelectedItem().toString();
                        /*
                        System.out.println(str1);
                        System.out.println(str2);
                        System.out.println(str3);
                       
                        System.out.println(dt);
                        System.out.println(sc5);
                        System.out.println(str6);
                      
                        System.out.println(str7);
                        System.out.println(str8);
                        System.out.println(str9);
                        System.out.println(sc10);
                       */
                        try
                        {
                            String insertquery="insert into studentreg values(?,?,?,?,?,?,?,?,?,?)";
                            PreparedStatement pst=con.prepareStatement(insertquery);
                            
                            pst.setInt(1,Integer.parseInt(str1));
                            pst.setString(2,str2);
                            pst.setString(3,str3);
                            pst.setString(4,dt);
                            pst.setString(5,sc5);
                            pst.setString(6,str6);
                            pst.setString(7,str7);
                            pst.setString(8,str8);
                            pst.setString(9,str9);
                            pst.setString(10,sc10);
                            pst.executeUpdate();
                           
                            System.out.println("data inserted");
                            JOptionPane.showMessageDialog(f1,"data inserted");
                        }
                        catch(Exception e)
                        {
                            System.out.println("data not inserted"+e);
                            JOptionPane.showMessageDialog(f1,"data not inserted");
                        }
                        
         	}
		if(ae.getSource()==b2)
		{
			t1.setText("");t2.setText("");
			t3.setText("");t6.setText("");
			t7.setText("");t8.setText("");
			t9.setText("");
		}
		if(ae.getSource()==b3)
		{
			JOptionPane.showMessageDialog(f1, "button working");
                        home hh=new home();
		}
	}
	public static void main(String a[])
	{
		new stdreg();
	}
}