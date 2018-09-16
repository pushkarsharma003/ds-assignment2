import java.util.*;
class SumofDigits
{
	public static int sum(int n)
	{
		if (n==0)
		{
			return 0;
		}
		else
		{
			return (n%10 + sum(n/10));
		}
	}	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str;
		System.out.println("enter the str");
		str=scan.next();
		int n=Integer.parseInt(str);
		System.out.println(sum(n));
	}
}