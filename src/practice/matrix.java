package practice;
import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("enter the number of rows: and co");
		int arr[][]= new int [2][2];
		//int matr[3][];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]= s.nextInt();
			}
		}
	/*	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>max)
					max=arr[i][j];
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		int temp;
		System.out.println("maximum element is:"+max);
	/*	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j+1]<arr[i][j])
				{
					temp=arr[i][j+1];
					arr[i][j+1]=arr[i][j];
					arr[i][j]=temp;
				}
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		*/
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
