package practice;
import java.util.Scanner;
public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s= new Scanner(System.in);
	System.out.println("enter the number of items:");
	int a=s.nextInt();
	int[] arr=new int[a];
	System.out.println("enter the array:");
	for(int i=0;i<a;i++)
	{
		arr[i]=s.nextInt();
	}
	
		//int[] arr={6,2,1,5,3};
		int temp=0;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<a;i++)
			System.out.println(arr[i]);
	}

}
