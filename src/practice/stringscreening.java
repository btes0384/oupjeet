package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class stringscreening {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
		int count=0;
		String a;
	a=br.readLine();
	String d[]= a.split(" ");
	int i;
	int max=0;
	for(i=0;i<a.length();i++)
	{
		if(a.charAt(i)!=' ')
		{
			count++;
		}
		else
		{
			if(max<count)
			{
				max=count;
				count=0;
			}
		}
	}
	for(i=0;i<a.length();i++)
	{
		System.out.println(d[i]);
	}
	
	
	System.out.println(max);
	}

}
