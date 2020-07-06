import java.util.Scanner;
class linkedListDemo
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		unorderedLinkedList ll = new unorderedLinkedList();	
		System.out.print("Enter number of elements in list: ");
		int n = scanner.nextInt();
		System.out.print("Enter the elements of list: ");
		for(int i=0;i<n;i++)
		{
			ll.insertAtEnd(scanner.nextInt());
		}
		ll.display();
		ll.deleteMin();
		ll.display();	
	}
}