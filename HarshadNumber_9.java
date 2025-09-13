package Advance_Level_Programs;

public class HarshadNumber_9 {
	
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
	
	public static boolean isHarshad(int n)
	{
		int sumOfDigits=sumOfDigits(n);
		if(n%sumOfDigits==0)
		{
			return true;
		}
		return false;
	}
   public static void main(String[] args) {
	int n=19;
	if(isHarshad(n))
	{
		System.out.println("harshad");
	}
	else
	{
		System.out.println("not harshad");
	}
}
}
