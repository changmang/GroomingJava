import java.util.Scanner;

public class SumOfDigits {
	
public static void SumDigit(int n)
{	 int c=0,r=0;
	int num=n;
	while(num>0)
	{
		r=num%10;
		c=c+r;
		num=num/10;
	}
	System.out.println("Sum of "+n+" is "+c);
}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumDigit(n);

	}

}
