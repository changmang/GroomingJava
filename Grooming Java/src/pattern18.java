
public class pattern18 {

	public static void main(String[] args) {
		int n=5,sp=0,st=n;
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
			st--;
			sp++;
		}

	}

}
