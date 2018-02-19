package practice;

import java.util.Scanner;

public class stringpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a;
String b;
int i=0,j=0;
Scanner s= new Scanner(System.in);
System.out.println("enter the string you want to check:");
a= s.nextLine();
//int n=a.length();
/*for(i=0;i<=a.length()/2;i++)
{
	if(a.charAt[i]!=a.charAt[n-i-1])
		{break;}
}
*/
/*if(b.equals(a))
	System.out.println("String Palindrome");
else
	System.out.println("String not palindrome");*/
int n = a.length();
int flag=0;
for ( i = 0; i < (n/2); ++i) {
   if (a.charAt(i) != a.charAt(n - i - 1)) {
       break;
   }
   else
	   flag=1;
   }
if(flag==1)
	System.out.println("String plaindrome");
else
	System.out.println("String not plaindrome");

}
	}

