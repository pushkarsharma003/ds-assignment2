import java.util.*;
class AvailabiltyArray
{
	public static boolean search (int array[],int  searchNum)
	{
		if (array.length==0)
		{
			return false;
		}
		int subArray[]=new int [array.length-1];
		for (int i=0;i<subArray.length;i++)
		{
			subArray[i]=array[i+1];
		}
		if (array[0]==searchNum)
		{
			return true;
		}
		else
		{
			return (search(subArray,searchNum));
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int m,n;
		System.out.println("enter the n");
		n=scan.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the m to search");
		m=scan.nextInt();
		System.out.println(search(arr,m));		
	}
}