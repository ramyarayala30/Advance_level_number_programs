package Advance_Level_Programs;

public class MegaPrimeBetweenRange___11 {
	
	
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
	public static boolean isMegaPrime(int n)
	{
		    int temp = n;
	        while (temp != 0)
	        {
	            int rem = temp % 10;
	            if (!isPrime(rem)) 
	            return false;
	            temp /= 10;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			if(isMegaPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	
	

}
