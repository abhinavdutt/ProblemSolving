
class TreeSz {

	TreeSz left , right;
	int data;
	public TreeSz(int key)
	{
		data=key;
		left=right=null;
	}
	
	
}
 class sizeoftree
{
	TreeSz root;
	
	int size()
	{
		return size(root);
	}
	 
	int size(TreeSz node)
	{
		if (node==null)
			return 0;
		
		else
			
			return (size(node.left)+1 + size(node.right));
			
			
	}
	
	public static void main(String[] args){
		
		sizeoftree bt=new sizeoftree ();
		bt.root=new TreeSz(1);
		bt.root.left=new TreeSz(2);
		bt.root.left=new TreeSz(3);
		bt.root.left.right=new TreeSz(4);
		bt.root.left.left=new TreeSz(5);
		
		System.out.println("The size of binary tree is " + bt.size());
		
	}
}


