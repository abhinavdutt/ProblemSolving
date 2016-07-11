class node
{
	 int data;
	 node left, right;
	 node(int key)
	 {
		 data=key;
		 left=right=null;
		 
	 }
}


public class IdenticalTree 
{

	static node root1 , root2;
	
	boolean IT(node a, node b)
	{
		if(a==null && b==null)
		{
			return true;
		}
		
		if(a!=null && b!=null)
		{
			return (a.data==b.data && IT(a.left, b.left) && IT(a.right, b.right));
			
		}
		
		return false;
	}
	


  public static void main(String[] args)
  {
	  IdenticalTree tree=new IdenticalTree();
	  tree.root1=new node(1);
	  tree.root1.left=new node(2);
	  tree.root1.right=new node(3);
	  tree.root1.left.left=new node(4);
	  tree.root1.left.right=new node(5);
	  
	  tree.root2=new node(1);
	  tree.root2.left=new node(2);
	  tree.root2.right=new node(3);
	  tree.root2.left.left=new node(4);
	  tree.root2.left.right=new node(5);
	  
	  if (tree.IT(root1, root2)) {
          System.out.println("Both trees are identical");
      } else {
          System.out.println("Trees are not identical");
      }
	  
	  
  }
  
}




 

