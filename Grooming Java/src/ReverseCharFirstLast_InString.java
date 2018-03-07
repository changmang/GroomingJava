
public class ReverseCharFirstLast_InString {

	public static void main(String[] args) {

		String str="Good things always happen unexpectedly";
		String str2="";
		
		String[] str1=str.split(" ");
		String temp=str1[0];
		str1[0]=str1[str1.length-1];
		str1[str1.length-1]=temp;
		
		for(int i=0;i<str1.length;i++)
		{	
			if(i==0||i==(str1.length-1))
		{
			String s=str1[i];
			char[] ch=s.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			str2=str2+ch[j];
		}
		}
			else
			{
				str2=str2+str1[i];
			}
			str2=str2+" ";
	}
		System.out.println(str2);
	}
}
