package BinarySearchTree;

public class BST {
	
	class Node{
	
		int data;
		
		Node left;
		
		Node right;
		
		public Node(int data){
		
			this.data = data;
			
			left = null;
			
			right = null;
		
		}
	
	}
	
	protected Node root;
	
	public BST(){
	
		root = null;
	
	}
	public void insert(int data){
	
		Node temp = root;
		
		Node newnode = new Node(data);
		
		newnode.left = null;
		
		newnode.right = null;
		
		newnode.data = data;
		
		root = insert(root, newnode);
	
	}
	
	//Insert data into the tree
	
	public Node insert(Node temp, Node newnode){
		
		int data;
		
		if(temp == null){
			
			temp = newnode;
			
		}
		
		else{
			
			if(newnode.data<temp.data){
				
				insert(temp.left, newnode);
				
				if(temp.left == null){
					
					temp.left = newnode;
					
				}
			}
			
			else{
				
				insert(temp.right, newnode);
				
				if(temp.right == null){
					
					temp.right = newnode;
					
				}
				
			}
		}
		return temp;
	}
	
	//Deleting data from the tree
	public void delete(int data){
		
		boolean found = false;
		
		if(root == null){
			
			System.out.println("Empty Tree!");
			
		}
		
		Node current = root;
		
		Node parent = null;
		
		while(current != null){
			
			if(current.data == data){
				
				found = true;
				
				break;
				
			}
			
			else{
				
				parent = current;
				
				if(current.data < data){
					
					current = current.left;
					
				}
				
				else{
					
					current = current.right;
					
				}
				
			}
			
		}
		
		if(found == false){
			
			System.out.println("Data not found");
			
		}
		
		//If node does not have children.
		
		if(current.right == null && current.left == null){
			
			if(parent.left == current){
				
				parent.left = null;
				
			}
			else{
				
				parent.right = null;
				
			}
			
		}
		
		//if the node has one child
		
		if(current.right != null && current.left == null){
			
			if(parent.left == current){
				
				parent.left = current.right;
				
				current = null;
			
			}
			
			else{
				
				parent.right = current.right;
				
				current=null;
			
			}
			
		}
		if(current.right == null && current.left!=null){
			
			if(parent.left == current){
				
				parent.left = current.left;
				
				current = null;
				
			}
			
			else{
				
				parent.right = current.left;
				
				current = null;
				
			}
		}
		
		//If the node has two children
		if(current.left != null && current.right != null){
			
			Node test = current.right;
			
			if(test.left == null && test.right == null){
				
				current = test;
				
				current.right = null;
				
			}
			
			else{
				
				while(test.left != null){
					
					parent = test;
					
					test = test.left;
					
				}
				
				current.data = test.data;
				
				test = null;
				
			}
		}
	}
	
	//Inorder
	public String inorder(){
		
		return inorder(root);
		
	}
	
	String s="";
	
	public String inorder(Node node){
		
		if(node == null)
		{
			
			return null;
			
		}
		
		inorder(node.left);
		
		System.out.print(node.data+"->");
		
		s=s+node.data;
		
		inorder(node.right);
		
		return s;
		
	}
	
	//preorder
	
	public String preorder(){
		
		return preorder(root);
		
	}
	
	String ps="";
	
	public String preorder(Node node){
		
		if(node == null){
			
			return null;
			
		}
		
		System.out.print(node.data+"->");
		
		ps=ps+node.data;
		
		preorder(node.left);
		
		preorder(node.right);
		
		return ps;
		
	}
	
	//post order
	
	public String postorder(){
		
		return postorder(root);
		
	}
	
	String pos;
	
	public String postorder(Node node){
		
		postorder(node.left);
		
		postorder(node.right);
		
		System.out.print(node.data+"->");
		
		pos=pos+node.data;
		
		return pos;
		
	}
	
}
