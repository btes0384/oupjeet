package practice;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int fact=1;
		while(num!=0)
		{
			fact=fact*num;
			num=num-1;
		}
		System.out.println(fact);
s.close();
	}

}
