package BinarySearchTree;

/*
 * 
 * Here we find if a tree is subtree of another tree. 
 * 
 * We do this by finding inorder and preorder traversals of both the trees. 
 * 
 * If child tree pattern is found in the parent tree pattern, then we can say that
 * 
 * the child tree is subtree of parent tree else the function returns false.
 * 
 */
public class treeSubtree {
	
	public static void main(String args[]){
		
		BST b1=new BST();
		
		b1.insert(10);
		
		b1.insert(4);
		
		b1.insert(11);
		
		b1.insert(3);
		
		BST b2=new BST();
		
		b2.insert(26);
		
		b2.insert(10);
		
		b2.insert(4);
		
		b2.insert(11);
		
		b2.insert(3);
		
		b2.insert(40);
		
		b2.insert(33);
		
		subTree s=new subTree();
		
		System.out.println(s.subtree(b2, b1));
		
		System.out.println(s.subtree(b1, b2));
		
	}
}

class subTree{
	
	public boolean subtree(BST parent, BST child){
		
		String p1 = parent.inorder();
		
		System.out.println();
		
		p1.toString();
		
		String p2 = parent.preorder();
		
		System.out.println();
		
		p2.toString();
		
		String c1 = child.inorder();
		
		System.out.println();
		
		c1.toString();
		
		String c2 = child.preorder();
		
		System.out.println();
		
		c2.toString();
		
		if(p1.contains(c1) || p2.contains(c2)){
			
			System.out.println("Subtree");
			
		}
		
		else
			
			System.out.println("Not a subtree");
		
		return( p1.contains(c1) || p2.contains(c2));
		
	}
	
}