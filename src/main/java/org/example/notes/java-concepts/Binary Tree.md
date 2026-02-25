BinaryTree.md

# Binary Tree

### What is a Binary Tree?
In a binary tree, the branches of the tree are made up of up to two child nodes for each node. The left and right nodes are the common names for the two youngsters. Child nodes make references to their parents, whereas parent nodes are nodes with children.

### Features of Binary Tree

* Hierarchical  Data Structure
* The topmost element is known as the root of the tree
* Every Node can have at most 2 children in the binary tree
* Can access elements randomly using index
  Eg: File system hierarchy
### Common traversal methods:
* preorder(root) : print-left-right
* postorder(root) : left-right-print 
* inorder(root) : left-print-right
* Binary Tree Advantages
* Can represent data with some relationship
* Insertion and search are much more efficient
### Binary Tree Disadvantages
* Sorting is difficult
* Not much flexible
* Binary Tree Applications
* File system hierarchy
* Multiple variations of the binary tree have a wide variety of applications
* Demonstration of Binary Tree

class TLNode
{
 int data;
 TLNode left,right;
 
 TLNode(int d)
 {
   data=d;
  }
 }
 
 
public class BinaryTree
{
   static void preorder(TLNode r)
   {
		if(r==null)
		    return;
		
		System.out.print(r.data+" ");
		
		preorder(r.left);
		preorder(r.right);
		
   }
   static void inorder(TLNode r)
   {
		if(r==null)
		    return;
		
		
		inorder(r.left);
		System.out.print(r.data+" ");
		inorder(r.right);
		
   }
   static void postorder(TLNode r)
   {
		if(r==null)
		    return;
		
		
		postorder(r.left);
		postorder(r.right);
		System.out.print(r.data+" ");

   }
     
    public static void main(String[] args)
	{
		TLNode root=new TLNode(1);
		
		root.left=new TLNode(2);
		root.right=new TLNode(3);
		
		root.left.left=new TLNode(4);
		root.left.right=new TLNode(5);
		
		root.right.left=new TLNode(6);
		root.right.right=new TLNode(7);
		preorder(root);
		System.out.println();
		
		inorder(root);
		System.out.println();
		
		postorder(root);
		System.out.println();
		
		
	}
}



	 
### Output
	
1 2 4 5 3 6 7 
4 2 5 1 6 3 7 
4 5 2 6 7 3 1 
# Binary Search Tree
### What is a Binary Search Tree?
The binary search tree is an advanced algorithm which is used to analyse the nodes, branches and many more. The BST was developed using the architecture of a fundamental binary search algorithm, allowing for quicker node lookups, insertions, and removals.

### Features of Binary Search Tree

A binary tree with the additional restriction
Restriction:
* The left child must always be less than the root node
* The right child must always be greater than the root node
* Insertion, Deletion, Search is much more efficient than a binary tree
### Binary Search Tree Advantages
* Maintains order in elements
* Can easily find the min and max Nodes in the tree

In order, traversal gives sorted elements
### Binary Search Tree Disadvantages
* Random access is not possible
* Ordering adds complexity
Binary Search Tree Applications
Suitable for sorted hierarchical data
Demonstration of Binary Search Tree
class TLNode{

	int data;
	TLNode left,right;
	
	TLNode(int d)
	{
		data=d;
	}
 }
 
 public class BST{
 
	TLNode root;
	
	TLNode insert(int d,TLNode root)
	{
	  if(root==null)
	    root=new TLNode(d);
	  
      else if(d<=root.data)
		root.left=insert(d,root.left);
	
	  else
		root.right=insert(d,root.right);
	
	  return root;
	}
	
	TLNode search(int d,TLNode root)
	{
		if(root.data==d)
			return root;
		else if(d<root.data)
			return search(d,root.left);
	    else
			return search(d,root.right);
	}
	
	
	
	void inorder(TLNode r)
   {
		if(r==null)
		    return;
		
		
		inorder(r.left);
		System.out.println(r.data);
		inorder(r.right);
		
   }
   

TLNode delete(TLNode root, int data) 
    { 
        
        if (root == null)  return root; 
 
        if (data < root.data) 
            root.left = delete(root.left, data); 
        else if (data > root.data) 
            root.right = delete(root.right, data); 
  
        else
        { 
            
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            
            root.data = minValue(root.right); 
  
            root.right = delete(root.right, root.data); 
        } 
  
        return root; 
    } 	
   int minValue(TLNode root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 

   
   public static void main(String[] args)
   {
		BST ob=new BST();
		ob.root=ob.insert(50,ob.root); 
                ob.root=ob.insert(30,ob.root); 
                ob.root=ob.insert(20,ob.root); 
                ob.root=ob.insert(20,ob.root); 
                ob.root=ob.insert(70,ob.root); 
                ob.root=ob.insert(60,ob.root); 
                ob.root=ob.insert(80,ob.root);    
		ob.root=ob.delete(ob.root,50);
		System.out.println("******" +ob.root.data);
		ob.inorder(ob.root);
		
		TLNode find=ob.search(30,ob.root);
		if(find==null)
			System.out.println("not found");
		else
			System.out.println("found : "+find.data);
		
		
	}
}

  Output:
  
******60
20
20
30
60
70
80
found : 30
