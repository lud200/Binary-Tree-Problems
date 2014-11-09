package BinarySearchTree;

/*
 * We find if the tree is balanced or not. 
 * 
 * First we find the max left depth and max right depth. 
 * 
 * If the difference between heights is <=1, then the tree is balanced.
 * 
 * Else, the tree is not balanced.
 */

public class balancedtree {
	
	public static void main(String args[]){
		
		isBalanced b = new isBalanced();
		
		b.insert(10);
		
		b.insert(4);
		
		b.insert(11);
		
		b.insert(3);
		
		b.insert(26);
		
		b.insert(32);
		
		b.insert(40);
		
		b.isbalanced();
		
	}
}
class isBalanced extends BST{
	
	public int maxDepth(Node node){
		
		if(node == null){
			
			return 0;
			
		}
		
		int maxleft = maxDepth(node.left);
		
		int maxright = maxDepth(node.right);
		
		int max = Math.max(maxleft, maxright);
		
		return 1+max;
	}
	
	public int minDepth(Node node){
		
		if(node == null){
			
			return 0;
			
		}
		
		int minLeft = minDepth(node.left);
		
		int minRight = minDepth(node.right);
		
		int min = Math.min(minLeft, minRight);
		
		return 1+min;
	}
	
	public void isbalanced(){
		
		isbalanced(root);
		
	}
	
	public void isbalanced(Node node){
		
		int maxDepth = maxDepth(node);
		
		int minDepth = minDepth(node);
		
		System.out.println("Max Depth="+maxDepth);
		
		System.out.println("Min Depth="+minDepth);
		
		if(maxDepth-minDepth <= 1){
			
			System.out.println("Balanced Tree");
			
		}
		
		else{
			
			System.out.println("Not a balanced tree");
			
		}
		
	}
	
}