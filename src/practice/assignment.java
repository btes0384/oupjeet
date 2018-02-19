package practice;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		for(int z=0;z<5;z++)
		{
			System.out.println("z is"+z);

			if((++x>2)&&(++y>2))
			{
				System.out.println(x+"in if "+y);

				x++;
				System.out.println(x+"after post inc x "+y);

		}}System.out.println(x+" "+y);

	}
	

}
