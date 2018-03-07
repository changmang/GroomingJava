
public class pattern17 {

	public static void main(String[] args) {
		int n=4,sp=n-1,st=1;
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(st);
			}
			System.out.println();
			st++;
			sp--;
		}

	
	}
}
//output
//   1
//  22
// 333
//4444 