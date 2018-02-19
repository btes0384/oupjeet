package practice;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int key=6;
		int mid=arr.length/2;
		int flag=0;
			if(mid==key)
				System.out.println("key matched");
			else if(key>mid)
			{
				for(int i=mid+1;i<arr.length;i++)
				{
					if(key==arr[i])
					{
						System.out.println("key matched");
						flag++;
					}
				}
			}
			else if(key<mid)
			{
				for(int i=0;i<=mid-1;i++)
				{
					if(key==arr[i])
					{
						System.out.println("key matched");
						flag++;
					}
				}
			}
			if(flag==0)
			System.out.println("key not found");
		
	}

}
