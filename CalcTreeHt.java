class HTNode 
{
	
	 int data;
	 HTNode left, right;
	 HTNode(int key)
	 {
		 data=key;
		 left=right=null;
		 
	 }

}

class CalcTreeHt
{
	
	static HTNode root;
	static HTNode a, b;
	 
	 int maxdepth(HTNode node)
	 {
		 if(node==null)
		 {
			 return 0;
		 }
		 else
		 {
			 int ldepth=maxdepth(node.left);
			 int rdepth=maxdepth(node.right);
			 
			 if(ldepth > rdepth )
			 {
				 return (ldepth+1);
				 
			 }
			 else
			 {
				 return (rdepth+1);
			 }
		 }
		 
	}
	 boolean mirror(HTNode a, HTNode b)
	 {
		 if(a==null && b==null)
		 {
			 return true;
		 }
		 if (a==null || b==null)
		 {
			 return false;
		 }
		 
		 return a.data==b.data
				 && mirror(a.left,b.right)
				 && mirror(a.right,b.left);
	 }	 
	 

	public static void main(String[] args)
	 {
		 CalcTreeHt tree= new CalcTreeHt();

		 tree.root=new HTNode(1);
		 tree.root.left=new HTNode(2);
		 tree.root.right=new HTNode(3);
		 tree.root.left.left=new HTNode(4);
		 tree.root.left.right=new HTNode(5);
		 System.out.println("Height of tree "+ tree.maxdepth(root));
		 
		   HTNode a = new HTNode(1);
	        HTNode b = new HTNode(1);
	        a.left = new HTNode(2);
	        a.right = new HTNode(3);
	        a.left.left = new HTNode(4);
	        a.left.right = new HTNode(5);
	 
	        b.left = new HTNode(3);
	        b.right = new HTNode(2);
	        b.right.left = new HTNode(5);
	        b.right.right = new HTNode(4);
	 
	        if (tree.mirror(a, b) == true)
	            System.out.println("Yes its mirror");
	        else
	            System.out.println("No it is not mirror");
		 
	 }
}
