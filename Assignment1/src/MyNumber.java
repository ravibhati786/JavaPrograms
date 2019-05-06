
public class MyNumber {

	private
			int number;
	public
			MyNumber()
			{
				number = 0;
			}
			MyNumber(int i)
			{
				this.number = i;
			}
			void isNegative()
			{
				if(number < 0)
					System.out.println("Yes, It is a negative number!");
				else
					System.out.println("No, It is not a negative number!");
			}
			void isPositive()
			{
				if(number > 0)
					System.out.println("Yes, It is a Positive number!");
				else
					System.out.println("No, It is not a Positive number!");
			}
			void isZero()
			{
				if(number == 0)
					System.out.println("Yes, It is a zero number!");
				else
					System.out.println("No, It is not a zero number!");
			}
			void isOdd()
			{
				if(number%2 != 0)
					System.out.println("Yes, It is a Odd number!");
				else
					System.out.println("No, It is not a Odd number!");
			}
			void isEven()
			{
				if(number%2 == 0)
					System.out.println("Yes, It is a Even number!");
				else
					System.out.println("No, It is not a Even number!");
			}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber ob = new MyNumber(12);
		
		ob.isNegative();
		ob.isPositive();
		ob.isEven();
		ob.isOdd();
		ob.isZero();
		
	}

}
