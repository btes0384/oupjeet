package practice;
public class primepattern {
	public static void main(String[] args) {
		
		int flag=0;
		int count=0;
		//boolean flag=true;
		for(int i=1;i<=5;i++)
		{
			count=0;
			//count++;
		for(int j=1;j<=i*2;j++)
		{
			//for(int l=1;l<=100;l++)
			//{
			
			flag=0;
			for(int k=2;k<=j/2;k++)
			{
				if(j%k==0)
					{
					flag++;
					}
				}
			if(flag==0 && count<i)
			{
				System.out.print(j);
				count++;
			}
			//flag=0;
		//}
		}
			System.out.println();
	
		}
		}
		}



