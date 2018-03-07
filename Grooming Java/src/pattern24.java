
public class pattern24 {

	public static void main(String[] args) {
		 int n=3,sp=n-1,st=1;
		 for(int i=1;i<=n;i++)
		 { int val=1;
			 for(int j=1;j<=sp;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=st;k++)
			 {
				 System.out.print(val);
				 val+=2;
			 }
			 System.out.println();
			 sp--;
			 st+=2;
		 }
				 

	}

}
