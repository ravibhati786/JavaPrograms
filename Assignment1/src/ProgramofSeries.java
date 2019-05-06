import Series.Fibonacci;
import Series.PrimeNumbers;
import Series.SquareNumbers;
public class ProgramofSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fb = new Fibonacci(5);
		fb.displaySeries();
		System.out.println();
		PrimeNumbers pn = new PrimeNumbers(100);
		pn.primeUpto();
		
		SquareNumbers sq = new SquareNumbers(5);
		sq.square();
	}

}
