package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class fibonacci {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(r);
int num= Integer.parseInt(br.readLine());
int n1=0;
int n2=1,n3;
int i=0;
while(i<num)
{
	System.out.print(n1+" ");
	n3=n1+n2;
	n1=n2;
	n2=n3;
	i++;
}
	}

}
