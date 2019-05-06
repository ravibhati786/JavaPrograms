/*	Write a Java program to create a Package “SY” which has a class 
  	SYMarks (members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which 
  	has a classTYMarks (members – Theory, Practicals). Create n objects of
	Student class (having rollNumber,name, SYMarks and TYMarks).
 */

package TY;
public class TYMarks {
	public int theory, practicals;
	public TYMarks(int th, int prac)
	{
		theory = th;
		practicals = prac;
	}
	public int getTotalTY()
	{
		return theory+practicals;
	}
}
