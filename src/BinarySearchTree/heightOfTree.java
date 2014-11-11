package BinarySearchTree;

public class heightOfTree {
	
	public static void main(String args[]){
		
		BST b=new BST();
		
		b.insert(5);
		
		b.insert(9);
		
		b.insert(12);
		
		b.insert(1);
		
		b.insert(2);
		
		b.insert(8);
		
		b.insert(10);
		
		
	}

}
class height extends BST{
	
	public int maxHeight(Node n){
		
		if(n == null)
		
			return 0;
		
		else{
			
			int maxLeft = maxHeight(n.left);
			
			int maxRight = maxHeight(n.right);
			
			int max = Math.max(maxLeft, maxRight);
			
			return max;
		}		
	}
}