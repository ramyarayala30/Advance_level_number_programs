package Advance_Level_Programs;

public class Palindrome_range_from_m_n_____12 {
	
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
	
	public static boolean isPalindrome(int n)
	{
		if(n==rev(n))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
     public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i);
			}
		}
	}

}
