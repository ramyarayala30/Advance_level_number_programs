package Advance_Level_Programs;

public class TechNumber_8 {
	
	public static int countDigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;			
		}
		return count;
	}
	public static int divisor(int n)
	{
		int count=countDigits(n);
		int divisor=1;
		for(int i=1;i<=count/2;i++)
		{
			divisor=divisor*10;
		}
		return divisor;
	}
	
	public static int sumOfSquare(int n)
	{
		int divisor=divisor(n);
		int fh=n/divisor;
		int sh=n%divisor;
		int sum=fh+sh;
		int square=sum*sum;
		return square;
	}
	
	public static boolean isTech(int n)
	{
		if(sumOfSquare(n)==n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int n=9801;
		if(isTech(n))
		{
			System.out.println(n+" is tech number");
		}
		else
		{
			System.out.println(n+" is not a tech number");
		}
	}

}
