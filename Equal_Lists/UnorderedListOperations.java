import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
class UnorderedListOperations
{
	public static void print(List<Integer> g)
	{
		for(int i=0;i<g.size();i++)
		{
			System.out.print(g.get(i)+" ");
		}
		System.out.println();
	}
	public static boolean check_equal_unordered(List<Integer> a, List<Integer> b)
	{
		if(a.size()!=a.size())
		{
			return false;
		}
		Map<Integer,Integer> map =  new HashMap<Integer,Integer>(); 
		for(int i=0;i<a.size();i++)
		{
			int key = a.get(i);
			int value = 0;
			//If map contains key
			if(map.containsKey(key))
			{
				//Get the value
				value = map.get(key); 
			}
			//Icrement value by 1
			map.put(key,value+1);
		}
		for(int i=0;i<b.size();i++)
		{
			int key=b.get(i);
			//If map doesn't contain key then return false
			if(!map.containsKey(key))
			{
				return false;
			}
			//If occurance of key is 1 then remove key from map
			if(map.get(key)==1)
			{
				map.remove(key);
			}
			else
			{
				map.put(key,map.get(key)-1);
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(12);
		a.add(15);
		List<Integer> b = new ArrayList<Integer>();
		b.add(23);
		b.add(20);
		b.add(12);
		b.add(10);
		System.out.print("List a: ");
		print(a);
		System.out.print("List b: ");
		print(b);
		if(check_equal_unordered(a,b))
		{
			System.out.println("list a and list b are equal");
		}
		else
		{
			System.out.println("list a and list b are not equal");
		}
		a.add(23);
		b.add(15);
		System.out.print("List a: ");
		print(a);
		System.out.print("List b: ");
		print(b);
		if(check_equal_unordered(a,b))
		{
			System.out.println("list a and list b are equal");
		}
		else
		{
			System.out.println("list a and list b are not equal");
		}
	}	
}