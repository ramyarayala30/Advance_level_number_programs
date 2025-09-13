package Advance_Level_Programs;

public class MegaPrime_2 {
	
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
	public static boolean isMegaPrime(int n)
	{
		    int temp = n;
	        while (temp != 0) {
	            int rem = temp % 10;
	            if (!isPrime(rem)) 
	            return false;
	            temp /= 10;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		int n=45;
		if(isMegaPrime(n))
		{
			System.out.println(n+" is mega prime");
		}
		else
		{
			System.out.println(n+" is not mega prime");
		}
	}
}
