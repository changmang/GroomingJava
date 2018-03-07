
public class java_righttriangle_pattern {

	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}

}
