import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		
		char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int n=sc.nextInt();
		int r=0;
		String hex="";
		int num=n;
		while(num!=0)
		{
			r=num%16;
			hex=ch[r]+hex;
			num=num/16;
		}
		System.out.println(hex);

	}

}
