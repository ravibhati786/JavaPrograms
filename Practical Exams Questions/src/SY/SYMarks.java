/*	Write a Java program to create a Package “SY” which has a class SYMarks (members – ComputerTotal, 
  	MathsTotal, and ElectronicsTotal). Create another package TY which has a 
  	classTYMarks (members – Theory, Practicals). Create n objects of
	Student class (having rollNumber,name, SYMarks and TYMarks).
 */
package SY;

public class SYMarks {

	public int computerTotal, mathsTotal, electronicsTotal;
	
	public SYMarks(int ct, int mt, int et) {
		// TODO Auto-generated constructor stub
		computerTotal = ct;
		mathsTotal  = mt;
		electronicsTotal = et;
	}
	public int getTotalSY()
	{
		return computerTotal+mathsTotal+electronicsTotal;
	}
	
}
