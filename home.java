import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class home implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JMenuBar mb;
	JMenu m1, m2, m3, m21;
	JMenuItem m11, m211, m212, m213, m31, m32, m33, m34,m35,m36;
        ImageIcon im;
        JLabel l1,l2;

	home()
	{
		f1 = new JFrame("Home");
		p1 = new JPanel();
		
		mb = new JMenuBar();

		m1 = new JMenu ("About");
		m2 = new JMenu ("Staff");
		m21 = new JMenu ("Instructor");
		m3 = new JMenu ("Student");

		m211 = new JMenuItem("Register");
		m212 = new JMenuItem("View");
		m213 = new JMenuItem("Delete");
		m31 = new JMenuItem("Register");
		m32 = new JMenuItem("View");
		m33 = new JMenuItem("Delete");
		m34 = new JMenuItem("Attendance");
                m35 = new JMenuItem("Payment");
                m36=new JMenuItem("Transfer");
		m11 = new JMenuItem ("Details");
                
                im=new ImageIcon("d:\\abesit.jpg");
                l1=new JLabel(im);
                
                
		
		f1.add(p1);
		f1.setJMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		m2.add(m21);
		m21.add(m211);
		m21.add(m212);
		m21.add(m213);
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
                m3.add(m35);
                m3.add(m36);
               	m1.add(m11);
                p1.add(l1);
                
                l1.setBounds(50,50,1200,500);
                

		p1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(1200, 1000);
		f1.setLocationRelativeTo(null);

		m11.addActionListener(this);
		m211.addActionListener(this);
		m212.addActionListener(this);
		m213.addActionListener(this);
		m31.addActionListener(this);
		m32.addActionListener(this);
		m33.addActionListener(this);
		m34.addActionListener(this);
                m35.addActionListener(this);
                m36.addActionListener(this);

	}

	public void actionPerformed (ActionEvent ae)
	{
		if(ae.getSource() == m11)
		{
                    JOptionPane.showMessageDialog(f1, "About page working");
                    l2=new JLabel("<html><body>The ABES Institute of Technology (AKTU College Code 290) embarked on its mission in the field of Technical Education in the year 2007. <br> It is situated on a prominent location at National Highway-24, near Delhi-Ghaziabad Border.<br>  The Institute campus is decent, green, clean with world class infrastructure for which it is awarded consecutively 7th Rank in all India for Swachh Campus Ranking 2017 and 6th Rank in all India for Swachh Campus Ranking 2018 by AICTE/MHRD, Govt. of India.<br>ABESIT Campus have air-conditioned rooms and tutorial rooms, ultra modern Auditorium and Seminar Hall with audio-visual aids alongwith Amphitheater of 2000 seating capacity.<br>Institute possesses proper playgrounds and hard courts for outdoor sports.<br>Separate decent boy’s and girl’s hostels with mess facility have attracted the attention of students.<br> The faculty residence in campus provide sense of security to hostelers, besides strict security monitoring 24X7.<br>  State-of-art Library with reading room provides teaching learning atmosphere in the campus.<br>  Campus houses Stationery Shop, Snacks Café, Laundry Shop.  The teaching faculty of the institute is qualified, competent and painstaking.</body></html>");
                    p1.add(l2);
                    l2.setBounds(100,80,2000,1200);
			
		}

		else if(ae.getSource() == m211)
		{

			JOptionPane.showMessageDialog(f1, "Instructior Register page working");
			//new instructdata();
		}

		else if(ae.getSource() == m212)
		{

			JOptionPane.showMessageDialog(f1, "Instructor View page working");
			//new adminins();
		}

		else if(ae.getSource() == m213)
		{

			JOptionPane.showMessageDialog(f1, "Instructor Delete page working");
		}

		else if(ae.getSource() == m31)
		{

			JOptionPane.showMessageDialog(f1, "Student Register page working");
			new stdreg();
		}

		else if(ae.getSource() == m32)
		{
			JOptionPane.showMessageDialog(f1, "Student View page working");
			new studentviewpage();
		}
		else if(ae.getSource() == m33)
		{
			JOptionPane.showMessageDialog(f1, "Student Delete page working");
			//new studentviewpage();
		}
	
		else if(ae.getSource() == m34)
		{
			JOptionPane.showMessageDialog(f1, "Student Attendance page working");
			
		}
                else if(ae.getSource() == m35)
		{
			JOptionPane.showMessageDialog(f1, "Student payment page working");
                       new payment();
			
		}
                else if(ae.getSource() == m36)
		{
			JOptionPane.showMessageDialog(f1, "Student transfer page working");
			new batchtransfer();
		}
	}

	public static void main (String arg[])
	{
		new home();
	}
}