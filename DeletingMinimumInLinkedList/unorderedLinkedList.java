class Node
{
	Node next;
	int data;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class unorderedLinkedList
{
	Node head=null;
	Node tail=null;
	void insertAtEnd(int data)
	{
		if(head==null)
		{
			head = new Node(data);
			tail=head;
			return;
		}
		tail.next = new Node(data);
		tail = tail.next;
	}
	void deleteMin()
	{
		// If the list is empty
		if(head==null)
		{
			System.out.println("List is empty, we cannot delete...!");
			return;
		}
		System.out.println("Deleting minimum...!");
		// Finding minimum
		// Initialize min with data of head
		int min=head.data;
		Node temp = head.next;
		while(temp!=null)
		{
			// If there is new minimum
			if(temp.data<min)
			{
				min = temp.data;
			}
			// Move to next node
			temp = temp.next;
		}
		// Deleting minimum node
		// If head has minimum value
		if(head.data == min)
		{
			temp = head;
			head = head.next;
			temp = null;
			return;
		}
		// If non-head node has minimum value
		temp = head;
		while(temp!=null)
		{
			// If min found
			if(temp.next.data == min)
			{
				// Skip temp
				temp.next = temp.next.next;
				temp = null;
				return;
			}
			// Move next node
			temp=temp.next;
		}
	}
	void display()
	{
		System.out.print("Content of unordered linked list: ");
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}