import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class batchtransfer extends DBCON implements ActionListener
{
	JFrame f1;
	JPanel p1;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	batchtransfer()
	{
		f1=new JFrame();
		p1=new JPanel();
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		

		b1=new JButton("Transfer");
		

		l1=new JLabel("Batch Code");
		l2=new JLabel("Student ID");
		l3=new JLabel("Course");
		

		f1.add(p1);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		
		
		p1.add(b1);
		

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);

		t1.setBounds(220,50,140,30);
		t2.setBounds(220,100,140,30);
		t3.setBounds(220,150,140,30);
		
		b1.setBounds(50,200,100,30);

		l1.setBounds(50,50,140,30);
		l2.setBounds(50,100,140,30);
		l3.setBounds(50,150,140,30);
		
		
		p1.setLayout(null);
		f1.setSize(400,300);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		f1.setBackground(Color.RED);
		//p1.setBackground(Color.GRAY);
		Font fon=new Font("",Font.BOLD,22);
		l1.setFont(fon);
		l2.setFont(fon);
		l3.setFont(fon);
                b1.addActionListener(this);
		

	}
        public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			JOptionPane.showMessageDialog(f1,"b1 working");
                        try
                        {
          
                        String str3=t3.getText();
                         int id=Integer.parseInt(t2.getText());
                            String updatequery="update studentreg set course='"+str3+"' where sid="+id;
                            PreparedStatement pst4=con.prepareStatement(updatequery);
                            pst4.executeUpdate();
                            JOptionPane.showMessageDialog(f1, "data updated");
                        }
                        catch(Exception e)
                        {
                           
                            System.out.println("data not updated"+e);
                            JOptionPane.showMessageDialog(f1, "data not update");
                        }
                }
        }
	public static void main(String...ar)
	{
		batchtransfer obj=new batchtransfer();
	}
}
