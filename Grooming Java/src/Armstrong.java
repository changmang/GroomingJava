import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,num2=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no to check wheter it is armstrong or not");
		num=sc.nextInt();
		int num1=num;
		for(int i=num1;i>0;i--)
		{
			c=num1%10;
			num2=num2+(c*c*c);
			num1=num1/10;
		}
		if(num==num2)
			System.out.println(num+" is Armstrong");
		else
			System.out.println(num+" is not an Armstrong no");
		
	}

}
