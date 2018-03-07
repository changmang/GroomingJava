
public class Pattern_java_Triangle {

	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		int n=4,st=1,sp=n-1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
		for(int k=0;k<st;k++)
		{
		
			System.out.print(ch[k]+" ");
		}
		System.out.println();
		sp--;
		st++;
	}		
	}
}
