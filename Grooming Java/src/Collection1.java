import java.util.ArrayList;

class Chocolate
{
	void giveArmoa()
	{
		System.out.println("Chocolate Arome");
	}
}
class Halwa
{
	void getAroma()
	{
		System.out.println("Halwa Aroma");
	}
}
public class Collection1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(new Chocolate());
		arr.add(new Halwa());
		arr.add(new Chocolate());
		arr.add(new Halwa());
		arr.add(new Halwa());
		System.out.println(arr.size());
		for(Object o:arr)
		{
			if(o instanceof Chocolate)
			{
				((Chocolate) o).giveArmoa();
			}
			else if(o instanceof Halwa)
			{
				((Halwa) o).getAroma();
			}
		}

	}

}
