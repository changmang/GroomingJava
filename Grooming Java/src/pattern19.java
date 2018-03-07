
public class pattern19 {

	public static void main(String[] args) {

		int n=5,st=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			st--;
		}
	}

}
