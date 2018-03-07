
public class pattern16 {

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
			st+=2;
			sp--;
			
		}
	}

}
//output
//   1
//  333
// 55555
//7777777 