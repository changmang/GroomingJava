
public class Palindrome {

	public static void main(String[] args) {
		int num=121,c=0,num1=0;
		int num2=num;
		for(int i=num2;num2>0;i--)
		{	
			c=num2%10;
			num1=num1*10+c;
			num2=num2/10;
		}
		System.out.println(num1);
		if(num==num1)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");

	}

}
