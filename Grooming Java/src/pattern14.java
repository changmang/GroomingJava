
public class pattern14 {

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
				System.out.print(k);
		}
		System.out.println();
		sp--;
		st+=2;

	}

}
}
//output
//   1
//  123
// 12345
//1234567 
   
