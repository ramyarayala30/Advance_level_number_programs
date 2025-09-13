package Advance_Level_Programs;

public class Perfect {
	
	public static int sumOfFactors(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=7;
		if(sumOfFactors(n)==n)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}

}
