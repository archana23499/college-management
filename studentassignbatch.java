import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class studentassignbatch extends DBCON implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3;
	JComboBox cb4;
	JButton b1,b2,b3;
	studentassignbatch()
	{
		f1=new JFrame("Student Assign Batch");
		p1=new JPanel();
		l1=new JLabel("Select Student ID");	
		l2=new JLabel("Student Name");
		l3=new JLabel("Course");
		l4=new JLabel("Select Batch");
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();

		String str[] = {"BT 01", "BT 02", "BT 03", "MT 01", "MT 02", "MT 03"};

		cb4=new JComboBox(str);
		b1=new JButton("Transfer");
		b2=new JButton("Back");
		b3=new JButton("Cancel");

		f1.add(p1);
		f1.setSize(425,400);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		p1.setLayout(null);
		f1.setResizable(false);

		p1.add(l1);p1.add(l2);p1.add(l3);p1.add(l4);p1.add(tf1);p1.add(tf2);p1.add(tf3);p1.add(cb4);
		p1.add(b1);p1.add(b2);p1.add(b3);

		l1.setBounds(50,50,150,25);
		l2.setBounds(50,100,150,25);
		l3.setBounds(50,150,150,25);
		l4.setBounds(50,200,150,25);
		tf1.setBounds(225,50,150,25);
		tf2.setBounds(225,100,150,25);
		tf3.setBounds(225,150,150,25);
		cb4.setBounds(225,200,150,25);
		b1.setBounds(50,275,100,25);
		b2.setBounds(180,275,95,25);
		b3.setBounds(300,275,75,25);	
		b1.addActionListener(this);	
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			JOptionPane.showMessageDialog(f1,"b1 working");
                        new batchtransfer();
		}
		if(ae.getSource()==b2)
		{
			JOptionPane.showMessageDialog(f1,"b2 working");
		}
		if(ae.getSource()==b3)
		{
			JOptionPane.showMessageDialog(f1,"b3 working");
		}
	}
	public static void main(String a[])
	{
		new studentassignbatch();
	}
}