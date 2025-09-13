package Advance_Level_Programs;

public class Sunny_Number_6 {
	
	
	public static boolean isSunny(int n)
	{
		if(n<0)
		{
			return false;
		}
		for(int i=0;i*i<=n+1;i++)
		{
			if(i*i==n+1)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n=8;
		if(isSunny(n))		{
			System.out.println(n+" is Sunny");
		}
		else
		{
			System.out.println(n+" is not sunny");
		}
	}

}
