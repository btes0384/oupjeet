package practice;
import java.util.Scanner;
public class insertionsort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of items:");
		int a=s.nextInt();
		int[] arr=new int[a];
		int temp;
		System.out.println("enter the array:");
		for(int i=0;i<a;i++)
		{
			if(i==0)
			arr[i]=s.nextInt();
			else
				{
				arr[i]=s.nextInt();
					for(int j=0;j<arr.length;j++)
					{
						if(arr[i]<arr[j])
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					for(int k=0;k<arr.length;k++)
						System.out.print(arr[k]+" ");
					
				}
			System.out.println();
		}
		//for(int i=0;i<a;i++)
			//System.out.println(arr[i]);

	}

}
