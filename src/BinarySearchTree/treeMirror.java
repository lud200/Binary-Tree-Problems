package BinarySearchTree;

public class treeMirror {
	
	public static void main(String args[]){
		
		BST b=new BST();
		
		b.insert(5);
		
		b.insert(9);
		
		b.insert(12);
		
		b.insert(1);
		
		b.insert(2);
		
		b.insert(8);
		
		b.insert(10);
		
		mirror m = new mirror();
		
		b.inorder();
		
		System.out.println();
		
		System.out.println("Now the tree is reversed...");
		
		m.tree_mirror(b.root);
		
		b.inorder();
	}
	
}
class mirror extends BST{
	
	public void tree_mirror(Node n){
		
		Node temp;
		
		if(n == null)
			
			return;
		
		else{
		
			tree_mirror(n.left);
		
			tree_mirror(n.right);
			
			temp = n.left;
			
			n.left = n.right;
			
			n.right = temp;
			
		}
		
	}
	
}