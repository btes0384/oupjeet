package practice;

public class namepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==1 && (j==1 || j==2))
					System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
