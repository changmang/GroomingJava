
public class pattern26 {

	public static void main(String[] args) {
		int n=4,val=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(val);
				if(val==1)
					val--;
				else
					val++;
			}
			System.out.println();
		}

	}

}

//output
//1
//01
//010
//1010

