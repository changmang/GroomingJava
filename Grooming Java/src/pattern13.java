
public class pattern13 {

	public static void main(String[] args) {
		int n=7,st=1,sp=3,mid=(n/2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
			st++;
			sp--;
			}
			else
			{
				st--;
				sp++;
			}
		
		}
		
		

	}

}
