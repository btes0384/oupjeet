package practice;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int length=0,n;
		n=num;
		while(n!=0)
		{
			length++;
			n=n/10;
		}
		System.out.println(length);
		n=num;
		int sum=0;
			while(n>0)
			{
				int a=n%10;
				sum=(sum*10)+a;
				n=n/10;
			}
			System.out.println(sum);
			if(sum==num)
				System.out.println("numbers are palindrome");
			else
				System.out.println("numbers are not palindrome");
	}
}


