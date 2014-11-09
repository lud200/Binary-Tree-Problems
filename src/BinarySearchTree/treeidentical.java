package BinarySearchTree;

public class treeidentical {
	
	public static void main(String args[]){
		
		BST b1=new BST();
		
		b1.insert(10);
		
		b1.insert(4);
		
		b1.insert(11);
		
		b1.insert(3);
		
		BST b2=new BST();
		
		b2.insert(10);
		
		b2.insert(4);
		
		b2.insert(11);
		
		b2.insert(3);
		
		BST b3=new BST();
		
		b3.insert(26);
		
		b3.insert(10);
		
		identicaltrees id=new identicaltrees();
				
		System.out.println(id.identical(b1.root, b2.root));
		
		System.out.println(id.identical(b1.root, b3.root));
	}
}
class identicaltrees extends BST{
	
	public boolean identical(Node t1, Node t2){
		
		if(t1==null && t2==null){
			
			return true;
			
		}
		
		if (t1!=null && t2!=null)
	    {
			return((t1.data==t2.data) && identical(t1.left, t2.left) && identical(t1.right, t2.right));
	    }
		
		return false;
	}
}
