import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
class OrderedListOperations
{
	public static void print(List<Integer> g)
	{
		for(int i=0;i<g.size();i++)
		{
			System.out.print(g.get(i)+" ");
		}
		System.out.println();
	}
	public static boolean check_equal_ordered(List<Integer> a, List<Integer> b)
	{
		if(a.size()!=a.size())
		{
			return false;
		}
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)!=b.get(i))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(12);
		a.add(15);
		a.add(20);
		List<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(12);
		b.add(15);
		b.add(20);
		System.out.print("List a: ");
		print(a);
		System.out.print("List b: ");
		print(b);
		if(check_equal_ordered(a,b))
		{
			System.out.println("list a and list b are equal");
		}
		else
		{
			System.out.println("list a and list b are not equal");
		}
		a.add(23);
		b.add(24);
		System.out.print("List a: ");
		print(a);
		System.out.print("List b: ");
		print(b);
		if(check_equal_ordered(a,b))
		{
			System.out.println("list a and list b are equal");
		}
		else
		{
			System.out.println("list a and list b are not equal");
		}
	}	
}