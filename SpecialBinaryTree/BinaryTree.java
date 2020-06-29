class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BinaryTree
{
	public static void main(String[] args) 
	{
		// Sample tree
		Node head = new Node(75);
		head.left = new Node(64);	
		head.right = new Node(8);
		head.right.left = new Node(15);
		head.right.right = new Node(3);
		// Testing
		System.out.println("Does above BT s special? "+isSpecialBT(head));
		head.left.left = new Node(17);
		System.out.println("Does above BT s special? "+isSpecialBT(head));
		head.left.right = new Node(8);
		System.out.println("Does above BT s special? "+isSpecialBT(head));
	}
	public static boolean isSpecialBT(Node tree)
	{
		// tree with only one node
		if(tree.left==null && tree.right==null)
		{
			return true;
		}
		// tree with one subtree
		if(tree.left==null || tree.right==null)
		{
			return false;
		}
		// Get values of left and right child values
		int left = tree.left.data;
		int right = tree.right.data;
		// Checking divisibility and testing left and right subtrees of tree
		return (left%right==0) && isSpecialBT(tree.left) && isSpecialBT(tree.right);
	}
}