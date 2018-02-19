package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class vowelconsstring {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//InputStreamReader r= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String a;
		int v=0;
		char b;
		a=br.readLine();
		for(int i=0;i<a.length();i++)
		{
		//	System.out.println("in for");
			b=a.charAt(i);
			if(a.charAt(i)== 'a' || a.charAt(i)== 'e' || a.charAt(i)== 'i' || a.charAt(i)== 'o' || a.charAt(i)== 'u')
			{
				//System.out.println("in if");
				v++;
			}
		}
		System.out.println(v);
	}

}
