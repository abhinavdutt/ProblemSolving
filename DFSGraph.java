import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
	
	int V;
	LinkedList<Integer> adj[];
	
	DFSGraph(int v)
	{
	    // Constructor
	    
	        V = v;
	        adj = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
    }
	 
	    //Function to add an edge into the graph
	    void addEdge(int v, int w)
	    {
	        adj[v].add(w);  // Add w to v's list.
	    }
	 
	    // A function used by DFS
	    void DFSUtil(int v,boolean visited[])
	    {
	        // Mark the current node as visited and print it
	        visited[v] = true;
	        System.out.print(v+" ");
	 
	        // Recur for all the vertices adjacent to this vertex
	        Iterator<Integer> i = adj[v].listIterator();
	        while (i.hasNext())
	        {
	            int n = i.next();
	            if (!visited[n])
	                DFSUtil(n,visited);
	        }
	    }
	 
	    // The function to do DFS traversal. It uses recursive DFSUtil()
	    void DFS()
	    {
	        // Mark all the vertices as not visited(set as
	        // false by default in java)
	        boolean visited[] = new boolean[V];
	 
	        // Call the recursive helper function to print DFS traversal
	        // starting from all vertices one by one
	        for (int i=0; i<V; ++i)
	            if (visited[i] == false)
	                DFSUtil(i, visited);
	    }
	    
	    void BFS(int s)
	    {
	    	boolean visited[]=new boolean[V];
	    	
	    	LinkedList<Integer> queue =new LinkedList<Integer>();
	    	visited[s]=true;
	    	queue.add(s);
	    	while(queue.size()!=0)
	    	{
	    		s=queue.poll();
	    		System.out.println(s+" ");
	    		
	    		Iterator<Integer> i=adj[s].listIterator();
	    		while(i.hasNext())
	    		{
	    			int n=i.next();
	    			if(!visited[n])
	    			{
	    				visited[n]=true;
	    				queue.add(n);
	    			}
	    		}
	    	}
	    	
	    }
	    
	    boolean CyclicU(int v, boolean visited[], boolean rec[])
	    
	    {
	    	
	    	Integer n;
	    	if(visited[v]==false)
	    	{
	    		visited[v]=true;
	    		rec[v]=true;
	    		
	    	}
	    	Iterator<Integer> i=adj[v].listIterator();
	    	while(i.hasNext())
	    	{
	    		 n=i.next();
	    		if(!visited[n] && CyclicU(n, visited, rec))
	    		{
	    			return true;
	    		}
	    		else if(rec[n])
	    		{
	    			return true;
	    		}
	    			
	    	}
	    	rec[v]=false;
	    	return false;
	    }
	    
	    boolean Cyclic()
	    {
	    	boolean visit[]=new boolean [V];
	    	boolean rec[]=new boolean[V];
	    	for(int i = 0; i < V; i++)
	        {
	            visit[i] = false;
	            rec[i] = false;
	        }
	     
	        // Call the recursive helper function to detect cycle in different
	        // DFS trees
	        for(int i = 0; i < V; i++)
	            if (CyclicU(i, visit, rec))
	                return true;
	     
	        return false;
	    }
	 
	    public static  void main(String args[])
	    {
	        DFSGraph g = new DFSGraph(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	     
	        if(g.Cyclic())
	            System.out.println("CYCLE");
	        else
	        	 System.out.println("NO CYCLE");
	        
	        
	        
	        
	        
	    }
	}


