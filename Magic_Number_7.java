package Advance_Level_Programs;

public class Magic_Number_7 {
	
	public static int SumOfDigits(int n)
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
	public static boolean isMagicNumber(int n)
	{
		int sum=SumOfDigits(n);
		if(SumOfDigits(sum)==1)
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		int n=12345;
		if(isMagicNumber(n))
		{
			System.out.println(n+" is magic");
		}
		else
		{
			System.out.println(n+" is not magic number");
		}
	}

}
