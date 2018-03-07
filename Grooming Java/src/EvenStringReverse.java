
public class EvenStringReverse {

	public static void main(String[] args) {
		String str="Good will always happen unexpectedly";
		String[] sa=str.split(" ");
		String str2="";
		
		for(int i=0;i<sa.length;i++)
		{
			if(i%2==0)
			{	String s=sa[i];//putting the single string of string array.
				char[] ch=s.toCharArray();//now converting that single-single string in to char array.
				for(int j=ch.length-1;j>=0;j--)
				{
					str2=str2+ch[j];
				}
			}
			else
				str2=str2+sa[i];
			
			str2=str2+" ";
		}
		System.out.println(str2);
	}

}
