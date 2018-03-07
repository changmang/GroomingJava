
public class pattern22 {

	public static void main(String[] args) {
		int n=4,sp=n-1,st=1,val=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				if(k<(st/2)+1)
				{
					System.out.print(val--);
				}
				else
				{
					System.out.print(val++);
				}
				
			}
			System.out.println();
			sp--;
			st+=2;
			val=i;
		
		}
	}
}
