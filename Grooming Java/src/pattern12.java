
public class pattern12 {

	public static void main(String[] args) {
		int n=5,sp=n-3,st=1,mod=(n/2)+1;
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
					if(i<mod)
					{
						st+=2;
						sp--;
					}
					else
					{
						sp++;
						st-=2;
					}
		}
		
			
		}
	}
//output

 