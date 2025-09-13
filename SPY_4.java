package Advance_Level_Programs;

public class SPY_4 {
	
	public static void main(String[] args)
	{
		int n=1234;
		int sum=0;
		int prod=1;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}
	}

}
