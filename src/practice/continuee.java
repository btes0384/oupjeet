package practice;
//import java.util.Scanner;

public class continuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s= new Scanner(System.in);
		int i,j;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
				continue;
			else
				System.out.println("odd"+i);
		}
}
}