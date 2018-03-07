
public class ReverseStringFrequency {

	public static void main(String[] args) {
		
		String str="Good things always happen unexpectedly";
		String[] sa=str.split(" ");
		
		String str2="";
		String str3="";
		for(int i=0;i<sa.length;i++)
		{
			String s=sa[i];
			char[] ch=s.toCharArray();
			int count=0;
			for(int j=ch.length-1;j>=0;j--)
			{
				str2=str2+ch[j];
				count++;
			}
			str2=str2+count+" ";
		}
	System.out.println(str2);
	}
	
	}
