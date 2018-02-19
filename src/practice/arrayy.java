package practice;
import java.util.Scanner;
public class arrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int a=s.nextInt();
		int[] arr=new int[a];
		int max=0;
		System.out.println("enter the array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<arr.length;i++)
			System.out.println("array is:"+arr[i]);

	}

}
