package practice;

public class substringstrtswithsamealphbet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="city is chandigarh";
		String d[]=a.split(" ");
		int j=0,count=0;
		char c=d[0].charAt(0);
		for(int i=0;i<d.length;i++)
		{
			j=0;
			if(d[i].charAt(j)==c)
			{
				count=1;
			}
			else
			{
				count=0;
				break;
			}
			}
		if(count>0)
			System.out.println("same char");
		else
			System.out.println("diff");
	}

}
