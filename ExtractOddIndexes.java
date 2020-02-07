	import java.util.LinkedList;
	import java.util.ArrayList;
	import java.util.List;
	class ExtractOddIndexes
	{
		public static List<Integer> extractOddIndexes(List<Integer> list)
		{
			//To store the values of odd indices
			List<Integer> listv2=new LinkedList<>();

			//iterate over the list from first odd index i.e. 1
			for(int i=1;i<list.size();i++)
			{ 
				//add value of list at index i to listv2 
				listv2.add(list.get(i));
				//and then remove it from list
				list.remove(i);	
			}
			//return listv2
			return listv2;
		}
		public static void main(String[] args) 
		{
				List<Integer> list1=new LinkedList<>();
				List<Integer> list2=new ArrayList<>();
				List<Integer> list1v2;
				List<Integer> list2v2;

				list1.add(13);
				list1.add(5);
				list1.add(7);
				list1.add(12);
				list1.add(42);
				list1.add(8);
				list1.add(23);
				list1.add(31);

				System.out.println("Before:"+list1);
				list1v2 = extractOddIndexes(list1);
				System.out.println("After: "+list1);
				System.out.println("After2: "+list1v2);

				for(int i=1;i<77;i+=3)
				{
					list2.add(i);
				}
				for(int i=0;i<20;i+=2)
				{
					list2.add(i);
				}

				System.out.println("Before:"+list2);
				list2v2 = extractOddIndexes(list2);
				System.out.println("After: "+list2);
				System.out.println("After2: "+list2v2);
		}	
	}