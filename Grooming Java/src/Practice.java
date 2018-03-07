
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Practice {
	public String print()
	{	test();
		return "Hello";
	}
	static String test()
	{	//Practice p=new Practice();
		//print();non-static members can't be called directly in static members.
		int i=10;
		int j=0;
		return "100";
	}	
//		try{
//			j=i/2;
//			//return "pass";
//		}
//		catch(ArithmeticException aexp)
//		{
//			return "fail";
//		}
//		finally
//		{
//			//return "passFail";
//		}
//		return "passfail";
//	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println(test());
		System.out.println("Main Ends");
	}
}
