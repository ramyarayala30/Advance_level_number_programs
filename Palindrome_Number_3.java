package Advance_Level_Programs;

public class Palindrome_Number_3 {
	
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
		int n=123;
		if(isPalindrome(n))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
