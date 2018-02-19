package practice;
import java.util.Scanner;

public class armstrong {

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
		//System.out.println(length);
		n=num;
		int arm=1;
		int m,v=0;
		int finarm=0;
		while(n!=0)
		{
			arm=1;
			v=0;
			m=n%10;
			while(v<length)
			{
			arm=arm*m;
			v++;
			}
			finarm=finarm+arm;
			n=n/10;
		}
		if(finarm==num)
			System.out.println("number is armstrong");
		else
			System.out.println("no is not armstrong");
		
		
	}
}