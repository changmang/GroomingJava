
public class checkprime {

	public static void main(String[] args) {
		
		int num=2;
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println("It's a prime no");
		else
			System.out.println("Its not a prime no");
	}
}
