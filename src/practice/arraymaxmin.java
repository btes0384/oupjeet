package practice;
import java.util.Scanner;
public class arraymaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int a=s.nextInt();
		int[] arr=new int[a];
		int min=10000;
		int max=0;
		System.out.println("enter the array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<arr.length;i++ )
		{
			if(arr[i]>max)
			 max=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			 min=arr[i];
		}
		System.out.println("maximum number is:"+max);
		System.out.println("minimum number is:"+min);
	}
}