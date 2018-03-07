
public class Stringtoupper {

	public static void main(String[] args) {
		
		String str="JaVaDeveloper";
		char[] ch=str.toCharArray();
		String str1="";
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				str1=str1+ch[i];
			}
			else
				str1=str1+(char)(ch[i]-32);
		}
System.out.println(str1);
	}

}
