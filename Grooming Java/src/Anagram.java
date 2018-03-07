import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		String s1="",s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter both the strings");
		s1=sc.nextLine();
		s2=sc.nextLine();

		s1=removeSpace(s1);
		s2 = removeSpace(s2);



		if(s1.length() == s2.length())

		{
			s1=toUpper(s1);
			s2 = toUpper(s2);

			s1=sort(s1);
			s2 = sort(s2);
			boolean res=comapre(s1, s2);
			if(res == true)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}

		}

		else
		{
			System.out.println("Strings are not anagram");
		}
	}
	public static String removeSpace(String str)
	{
		char[] ch = str.toCharArray();
		String str1 ="";
		for(char c:ch)
		{
			if(c!=' ')
				str1=str1+c;

		}
		return str1;

	}
	public static String toUpper(String str)
	{
		char[] ch1=str.toCharArray();
		String str1="";
		for(int i=0;i<=ch1.length-1;i++){
			if(ch1[i]>=65 &&ch1[i]<=90)
				str1=str1+ch1[i];
			else
				str1 =str1+(char)(ch1[i]-32);
		}
		return str1;

	}
	public static String sort(String str)
	{
		char[] ch =str.toCharArray();
		String str1="";
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(char c:ch)
			str1=str1+c;
		return str1;

	}

	public static boolean comapre(String str1,String str2)
	{
		boolean flag = true;
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				flag = false;
				break;
			}				
		}
		return flag;
	}
}
