
public class pattern6 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{ 
			for(int j=n;j>=1;j--)
			{
				if((i+j)>=(n+1))
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
//output
//5
//54
//543
//5432
//54321