package Advance_Level_Programs;

public class nth_twisted_prime___16 {
	
	public static int nthTwistedPrime(int n)
	{
		
		int num=0;
		while(n!=0)
		{
			num++;
			if(isTwistedPrime(num))
			{
				n--;
			}
		}
		return num;
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
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
		int n=5;
		System.out.println(nthTwistedPrime(n));
	}
	
}
