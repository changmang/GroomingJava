
public class pattern2 {

	public static void main(String[] args) {
		int n=3,val=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(val);
				val=val+10;
			}
			System.out.println();
		}

	}

}
//output
//102030
//405060
//708090
