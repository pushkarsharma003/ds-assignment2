import java.util.*;
class ReverseArrRec
{
	public static void reverse(int array[],int start,int end)
	{
		if (start>=end)
			return;
		int temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		reverse(array,start+1,end-1);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter the n");
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		reverse(arr,0,n-1);
		System.out.print("reverse array is :");
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}