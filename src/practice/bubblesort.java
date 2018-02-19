package practice;

import java.util.Scanner;

public class bubblesort {

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
		int temp=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int k=0;k<a;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		
	//	for(int i=0;i<a;i++)
	//	{
	//		System.out.println();
	//	}
	}

}
