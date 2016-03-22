import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Node{
public int value;
public Node(int value)
{
this.value=value;
}
}

class NodeList extends ArrayList<Node>
{ 
public void sort(){
Collections.sort(this, new Comparator<Node>(){
@Override
public int compare(Node n1, Node n2){
return n1.value - n2.value;
}
});
}
}
public class Solution2
{
public static void main (String args[])
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String[] vals=new String[0];
try
{
vals=br.readLine().split(" ");
}
catch(IOException e){
e.printStackTrace(); 
}
NodeList list =new NodeList();
for(String val:vals)
{
list.add(new Node(Integer.parseInt(val))); 
}
list.sort();
for(Node node: list)
{
System.out.println(node.value);
}
}
}