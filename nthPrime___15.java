package Advance_Level_Programs;

public class nthPrime___15 {
	
	public static int nthPrime(int n)
	{
		 int count = 0;   // how many primes found
	        int num = 1;     // current number being tested

	        while (count < n) {
	            num++;
	            if (isPrime(num)) {
	                count++;
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
  public static void main(String[] args) {
	int n=5;
	int num=0;
	System.out.println(nthPrime(n));
}
}
