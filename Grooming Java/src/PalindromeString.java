import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		String original,reverse="";
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string to check if it is palindrome or not");
		original=in.nextLine();
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println(original+" is palindrome");
		else
			System.out.println(original+" is not palindrome");

	}

}
