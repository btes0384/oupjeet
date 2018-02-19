package practice;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number you want the table for:");
int num=s.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(num+"*"+i+"="+(num*i));
	}
	}

}
