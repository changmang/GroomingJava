
public class PrimeSeries {

	public static void main(String[] args) {
	
		for(int i=1;i<1000;i++)
		{  boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(i+" is a prime no");
		}
		//System.out.println();
	}
}