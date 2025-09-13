package Advance_Level_Programs;

public class Neon_5 {
 
	public static int sumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static int square(int n)
	{
		int sd=sumOfDigits(n);
		int square=sd*sd;
		int sumOfSquare=sumOfDigits(square);
		return sumOfSquare;
	}
	public static void main(String[] args) {
		int n=7;
		System.out.println(sumOfDigits(n));
		System.out.println(square(n));
		if(sumOfDigits(n)==square(n))
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not a neon number");
		}
	}
}
