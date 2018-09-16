import java.util.*;
class powerCal
{ 
    public static int powerfun(int m,int n) 
    { 
		if (n==0)
		{
			return 1;
		}
		else if (n==1)
		{
			return m;
		}
		else
		{
			return (m*powerfun(m,n-1));
		}
    }
    public static void main (String args[]) 
    { 
		int x,y;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the x");
		x=scan.nextInt();
		System.out.println("enter the y");
		y=scan.nextInt();
		System.out.println(powerfun(x,y));
    } 
} 