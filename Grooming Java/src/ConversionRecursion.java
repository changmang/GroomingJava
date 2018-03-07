
public class ConversionRecursion {
	static String res="";
	public String convert(int num)
	{
		if(num!=0)
			convert(num/2);
		
		return res=res+num%2;
	}

	public static void main(String[] args) {
		ConversionRecursion cr=new ConversionRecursion();
		String res1 = cr.convert(7);
		System.out.println(res1);
		
		

	}

}
