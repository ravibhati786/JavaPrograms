/*	Define an abstract class “Staff” with members name and address. Define two sub-classes of thisclass 
 * 	– “FullTimeStaff” (department,salary) and “PartTimeStaff” (number-of-hours, rate-perhour). Define
	appropriate constructors. Create n objects which could be of either FullTimeStaff or PartTimeStaff 
	class by asking the user’s choice. Display details of all “FullTimeStaff” objects and all “PartTimeStaff”
	objects.(Accept the details using Swing)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
abstract class Staff
{
	String name,address;
	Staff(String n, String add)
	{
		name = n;
		address = add;
	}
	void display()
	{
		System.out.print("\n"+name+"\t"+address+"\t");
	}
}
class FullTimeStaff extends Staff
{
	String dept;
	int sal;
	public FullTimeStaff(String n, String add, String dept, int sal) {
		// TODO Auto-generated constructor stub
		super(n,add);
		this.dept = dept;
		this.sal = sal;
	}
	void display()
	{
		super.display();
		System.out.print(dept+"\t"+sal);
	}
}
class PartTimeStaff extends Staff
{
	int num_of_hours, rate_per_hour;
	public PartTimeStaff(String n, String add,int n_o_h, int r_p_h)
	{
		super(n,add);
		num_of_hours = n_o_h;
		rate_per_hour = r_p_h;
	}
	void display()
	{
		super.display();
		System.out.print(num_of_hours+"\t"+rate_per_hour);
	}
}
public class Program36 extends JFrame implements ActionListener{
	JLabel ln,la,ld,ls,lnoh,lrp,ltype;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JRadioButton btnPart, btnFull;
	JButton btn;
	Staff staff[];
	int count =0;
	Program36(int n)
	{
		super("Staff Example!");
		staff = new Staff[n];
		ln = new JLabel("Enter Name :"); ln.setBounds(10, 20, 80, 30);
		tf1 = new JTextField(); tf1.setBounds(90,20,90,30);
		la = new JLabel("Enter Address :"); la.setBounds(200,20,100,30);
		tf2 = new JTextField(); tf2.setBounds(300,20,90,30);
		ld = new JLabel("Enter Dept :"); ld.setBounds(10,70,80,30);
		tf3 = new JTextField(); tf3.setBounds(90,70,90,30);
		ls = new JLabel("Enter Salary :"); ls.setBounds(200,70,100,30);
		tf4 = new JTextField(); tf4.setBounds(300,70,90,30);
		lnoh = new JLabel("Num_of_hours :"); lnoh.setBounds(10,120,100,30);
		tf5 = new JTextField(); tf5.setBounds(100,120,90,30);
		lrp = new JLabel("Rate_per_hour :"); lrp.setBounds(200,120,100,30);
		tf6 = new JTextField(); tf6.setBounds(300,120,90,30);
		btn = new JButton("Insert"); btn.setBounds(140,220,80,40);
		
		ltype = new JLabel("Select Type of Staff :"); ltype.setBounds(10,170,130,30);
		btnPart = new JRadioButton("Part Time"); btnPart.setBounds(130,170,80,30); 
		btnFull = new JRadioButton("Full Time"); btnFull.setBounds(210,170,80,30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(btnFull);bg.add(btnPart);
		
		tf3.setEditable(false);tf4.setEditable(false);tf5.setEditable(false);tf6.setEditable(false);
		add(ln);add(la);add(ld);add(ls);add(lnoh);add(lrp); add(ltype);
		add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);
		add(btn);add(btnPart);add(btnFull);
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		btnPart.addActionListener(this);
		btnFull.addActionListener(this);
		btn.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnPart)
		{
			tf5.setEditable(true);tf6.setEditable(true);tf3.setEditable(false);tf4.setEditable(false);
		}
		else if(e.getSource() == btnFull)
		{
			tf3.setEditable(true);tf4.setEditable(true);tf5.setEditable(false);tf6.setEditable(false);
		}
		else if(e.getSource() == btn)
		{
			if(count < staff.length)
			{
				String name = tf1.getText();
				String add = tf2.getText();
				if(btnPart.isSelected())
				{
					int n_o_h = Integer.parseInt(tf5.getText());
					int r_p = Integer.parseInt(tf6.getText());
					staff[count] = new PartTimeStaff(name, add, n_o_h, r_p);

				}
				else if(btnFull.isSelected())
				{
					String dept = tf3.getText();
					int sal = Integer.parseInt(tf4.getText());
					staff[count] = new FullTimeStaff(name, add, dept, sal);
				}
				staff[count].display();
				tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");tf5.setText("");tf6.setText("");
				count++;
			}
			else
			{
				dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Staff you want to Insert =");
		int n = in.nextInt();
		Program36 p = new Program36(n);
	}

}
