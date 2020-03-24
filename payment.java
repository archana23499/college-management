
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class payment extends DBCON  implements ActionListener
{
	JFrame f1;
	JPanel p1;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        JComboBox c81, c82, c83;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
        payment()
	{
		f1=new JFrame();
		p1=new JPanel();
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		t7=new TextField();
		//t8=new TextField();
		

		b1=new JButton("save");
		b2=new JButton("cancel");
                b3=new JButton("Reset");

		l1=new JLabel("Transaction ID");
		l2=new JLabel("Student ID");
		l3=new JLabel("Name");
		l4=new JLabel("Amount");
		l5=new JLabel("Fine");
		l6=new JLabel("Dues");
		l7=new JLabel("Net");
		l8=new JLabel("Date");

                String str[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                c81=new JComboBox();
		c82=new JComboBox(str);
		c83=new JComboBox();
                for(int i=1; i<32; i++)
		{
			c81.addItem(i);
		}

		for(int i=1980; i<2018; i++)
		{
			c83.addItem(i);
		}

		f1.add(p1);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);
		p1.add(t7);
		//p1.add(t8);
                
                p1.add(c81); p1.add(c82); p1.add(c83);
		
		p1.add(b1);
		p1.add(b2);
                p1.add(b3);
                
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		

		t1.setBounds(220,50,140,30);
		t2.setBounds(220,100,140,30);
		t3.setBounds(220,150,140,30);
		t4.setBounds(220,200,140,30);
		t5.setBounds(220,250,140,30);
		t6.setBounds(220,300,140,30);
		t7.setBounds(220,350,140,30);
		//t8.setBounds(220,400,140,30);
		

		b1.setBounds(50,500,100,30);
		b2.setBounds(200,500,100,30);
                b3.setBounds(350,500,100,30);
                
                c81.setBounds(220, 400,40,30);
		c82.setBounds(270, 400,40,30);
		c83.setBounds(320, 400,40,30);

		l1.setBounds(50,50,160,30);
		l2.setBounds(50,100,140,30);
		l3.setBounds(50,150,140,30);
		l4.setBounds(50,200,140,30);
		l5.setBounds(50,250,140,30);
		l6.setBounds(50,300,140,30);
		l7.setBounds(50,350,140,30);
		l8.setBounds(50,400,140,30);
		
		
		p1.setLayout(null);
		f1.setSize(600,700);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		f1.setBackground(Color.RED);
		//p1.setBackground(Color.GRAY);
		Font fon=new Font("",Font.BOLD,22);
		l1.setFont(fon);
		l2.setFont(fon);
		l3.setFont(fon);
		l4.setFont(fon);
		l5.setFont(fon);
		l6.setFont(fon);
		l7.setFont(fon);
		l8.setFont(fon);
			
		b1.addActionListener(this);
		b2.addActionListener(this);
                b3.addActionListener(this);

	}
        public void actionPerformed(ActionEvent ae)
	{
            if(ae.getSource()==b1)
            {
                JOptionPane.showMessageDialog(f1, "button working");
                
                
                
                String str1=t1.getText();
                String str2=t2.getText();
                String str3=t3.getText();
                
                 String sc81=c81.getSelectedItem().toString();
                 String sc82=c82.getSelectedItem().toString();
                 String sc83=c83.getSelectedItem().toString();
                String dt=sc81+""+sc82+""+sc83;
                String str4=t4.getText();
                String str5=t5.getText();
                String str6=t6.getText();
                int amt1=Integer.parseInt(str4);
                int amt2=Integer.parseInt(str5);
                int amt3=Integer.parseInt(str6);
                int net=amt1+amt2+amt3;
                String str7=Integer.toString(net);
                t7.setText(str7);
                //String str7=t7.getText();
                //String str8=t8.getText();
                        
                        
                 System.out.println(str1);
                 System.out.println(str2);
                 System.out.println(str3);
                 System.out.println(str4);
                 System.out.println(str5);
                 System.out.println(str6);
                 System.out.println(net);
                 System.out.println(dt);
                 
                 try
                 {
                     String insertquery="insert into payment values(?,?,?,?,?,?,?,?)";
                     PreparedStatement pst=con.prepareStatement(insertquery);
                     //String viewquery="select * from payment where sid="+id;
                      pst.setInt(1,Integer.parseInt(str1));
                      pst.setInt(2,Integer.parseInt(str2));
                      pst.setString(3,str3);
                      pst.setString(4,str4);
                      pst.setString(5,str5);
                      pst.setString(6,str6);
                      pst.setString(7,str7);
                      pst.setString(8,dt);
                         
                      //pst.setInt(4,Integer.parseInt(str4));
                      //pst.setInt(5,Integer.parseInt(str5));
                      //pst.setInt(6,Integer.parseInt(str6));
                      //pst.setInt(7,Integer.parseInt(str7));
                      //pst.setInt(8,Integer.parseInt(str8));
                      
                      pst.executeUpdate();
                       System.out.println("data inserted");
                       JOptionPane.showMessageDialog(f1,"data inserted");     
                           
                 }
                 catch(Exception e)
                 {
                     System.out.println("data not saved");
                 }
            }
            if(ae.getSource()==b3)
		{
			t1.setText("");t2.setText("");
			t3.setText("");t4.setText("");
			t5.setText("");t6.setText("");
                        t7.setText("");
			
		}
		if(ae.getSource()==b2)
		{
			//JOptionPane.showMessageDialog(f1, "button working");
                        home hh=new home();
		}
        }
	public static void main(String...ar)
	{
		payment obj=new payment();
	}
}