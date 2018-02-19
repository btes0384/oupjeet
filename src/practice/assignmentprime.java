package practice;

public class assignmentprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int num=2;
		assignmentprime obj=new assignmentprime();
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				/*if(obj.prime(num)!=1)
				{
					num++;
				}
				else
				{	
				System.out.print(num+" ");
			
				}*/
				while(!(obj.prime(num)))
				{
					num++;
				}
				System.out.print(num+" ");
				num++;
				}
			System.out.println();
			//num++;
		}
		
		
	}
	boolean prime(int num)
	{
		int i;
		int flag=0;
		for(i=2;i<num;i++)
		{
			if(num%i!=0)
				flag=1;
			else
			{
				flag=0;
				break;
			}
			
		}
		if(flag==1 || num==2)
			return true;
		else
			return false;
	}

}
