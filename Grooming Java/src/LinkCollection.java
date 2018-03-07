import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Fruit
{
}
class Orange extends Fruit
{
	
}
public class LinkCollection {

	public static void main(String[] args) {

		LinkedList lst=new LinkedList();
		lst.add("java");
		lst.add(1);
		lst.add(1);
		Orange o1=new Orange();
		lst.add(o1);
		lst.add(null);
		lst.add(null);
		lst.add(new Orange());
		lst.add(new String("Bangalore"));
		lst.add(true);
		lst.add(false);
		
		System.out.println(lst.size());
		System.out.println(lst.get(5));
		lst.addFirst(new Orange());
		System.out.println(lst);
		lst.addLast("Hello");
		System.out.println(lst);
		List lst1=new LinkedList();
		lst1.add("java");
		lst1.add(10);
		lst1.add(true);
		System.out.println(lst1);
		lst1.add(1,null);
		System.out.println(lst1);
		System.out.println(lst.addAll(lst1));
		System.out.println(lst);
		lst1.remove(null);
		System.out.println(lst1);
		System.out.println(lst);
		Iterator itr = lst.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		ListIterator itr2 = lst1.listIterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		System.out.println();
		while(itr2.hasPrevious())
		{
			System.out.print(itr2.previous()+" ");
		}
		System.out.println();
		lst.removeLast();
		System.out.println(lst);
		lst.remove();
		System.out.println(lst);
		
		System.out.println(lst.clone());
		System.out.println(lst.containsAll(lst1));
		System.out.println(lst.getFirst());
		System.out.println(lst.getLast());
		lst.removeAll(lst1);
		System.out.println(lst);
		
		
	}

}
