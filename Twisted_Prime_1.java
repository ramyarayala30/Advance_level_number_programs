package Advance_Level_Programs;

public class Twisted_Prime_1 {
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static int rev(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	
	public static boolean isTwistedPrime(int n)
	{
		if(isPrime(n))
		{
			if(isPrime(rev(n)))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int n=13;
		/*if(isTwistedPrime(n))
		{
			System.out.println(n+" is twisted prime");
		}
		else
		{
			System.out.println(n+" is not twisted");
		} */
		for(int i=1;i<=1000;i++)
		{
			if(isTwistedPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
