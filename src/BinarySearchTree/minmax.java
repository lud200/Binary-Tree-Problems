package BinarySearchTree;
/*
 * 
 * This is used to find the minimum and maximum from a tree
 * 
 * Minimum from tree:
 * 
 * We go to the left of the tree till we find a least value. 
 * 
 * If the tree does not have left, then root node will be the min value
 * 
 * Max from tree:
 * 
 * We go to the right of the tree till we find highest value.
 * 
 * If the tree does not have right, then root will be the max value.
 */
public class minmax{
	
	public static void main(String args[]){
		
		minheight b=new minheight();
		
		b.insert(5);
		
		b.insert(9);
		
		b.insert(12);
		
		b.insert(1);
		
		b.insert(2);
		
		b.insert(8);
		
		b.insert(10);
		
		b.preorder();
		
		b.minimum();
		
		b.maximum();
	}
	
}

class minheight extends BST{
	
	public void minimum(){
		
		minimum(root);
		
	}
	
	public void minimum(Node node){
		
		while(node.left != null){
			
			node = node.left;
			
		}
		
		System.out.println("Min from tree is:"+node.data);
		
	}
	
	public void maximum(){
		
		maximum(root);
		
	}
	
	public void maximum(Node node){
		
		while(node.right != null){
			
			node = node.right;
		}
		
		System.out.println("Maximum from tree is:"+node.data);
		
	}
	
}
