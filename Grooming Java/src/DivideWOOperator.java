import java.util.Scanner;

public class DivideWOOperator {

	public static void main(String[] args) {
		int number,divisor,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the numbers");
		number=sc.nextInt();
		sc.nextLine();
		divisor=sc.nextInt();
		//sc.nextLine();
		int number1=number;
		
		while((number1-divisor)>=0)
		{  	count++;
			number1=number1-divisor;
			
		}
		System.out.println("Quotient of number "+number+" is "+count);
	}

}
