/*
 Design employee form (empno, name, sal) & save the data in emp.dat file on click of button.
 */

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.event.*;

class Employee implements Serializable
{
	int empno;
	String empname;
	int empsal;
	Employee(int no, String name, int sal)
	{
		empno = no;
		empname = name;
		empsal = sal;
	}
	void setData()
	{
		
	}
}
public class Program1 extends JFrame implements ActionListener{

	JLabel lblno,lblname,lblsal;
	JTextField tfno,tfname,tfsal;
	JButton save, display;
	ObjectOutputStream out;
	FileOutputStream fout;
	FileInputStream fin;
	ObjectInputStream in;
	Program1()
	{
		super("Employee Details!");
		try {
			fout = new FileOutputStream("D:\\java prog\\Files\\emp1.dat");
			fin = new FileInputStream("D:\\java prog\\Files\\emp1.dat");
			out = new ObjectOutputStream(fout);
			in = new ObjectInputStream(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblno = new JLabel("Emp_No : "); lblno.setBounds(20,20,80,30);
		lblname = new JLabel("Emp_Name : "); lblname.setBounds(20,60,80,30);
		lblsal = new JLabel("Emp_Salary : "); lblsal.setBounds(20,100,80,30);
		
		tfno = new JTextField(); tfno.setBounds(100,20,120,30);
		tfname = new JTextField(); tfname.setBounds(100,60,120,30);
		tfsal = new JTextField(); tfsal.setBounds(100,100,120,30);
		
		save = new JButton("Save"); save.setBounds(20, 160, 70, 40);
		display = new JButton("Display"); display.setBounds(130,160,80,40);
		
		add(lblno);add(lblname);add(lblsal);
		add(tfno);add(tfname);add(tfsal);
		add(save);add(display);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		save.addActionListener(this);
		display.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == save)
		{
			try
			{
				Employee emp = new Employee(Integer.parseInt(tfno.getText()), tfname.getText(), Integer.parseInt(tfsal.getText()));	
				out.writeObject(emp);
				out.flush();
				System.out.println("Successful");
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		if(e.getSource() == display)
		{
			try
			{
				Employee emp1 = ((Employee)in.readObject());
				in.close();	
				System.out.println(emp1.empno+" "+emp1.empname+" "+emp1.empsal);
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Program1 p =new Program1();
		
	}

}
