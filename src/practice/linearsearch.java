package practice;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of items:");
		int a=s.nextInt();
		int flag=0;
		int[] arr=new int[a];
		System.out.println("enter the array:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the number to be searched:");
		int key=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("key matched");
				flag++;
				break;
			}
			
		}
		if(flag==0)
			System.out.println("element not found");
		
	}

}
