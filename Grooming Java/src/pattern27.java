
public class pattern27 {

	public static void main(String[] args) {
		int n=5,sp=n-1,st=1;
		for(int i=1;i<=5;i++)
		{int l=1;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++)
		{	
			System.out.print(l+" ");
			l=l*(i-k)/k;
		}
		System.out.println();
		sp--;
		st+=2;
		}
	}
}
