
public class FibonaaciRecursion {
	
	static int a=0,b=1,c=0;
	public static void fibonacci(int n){
		
	if(n>0)
	{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	fibonacci(--n);
	}
		 
	}
	public static void main(String[] args) {
		int count=10;
		System.out.print(a+" "+b+" ");
		fibonacci(count-2);

	}

}
