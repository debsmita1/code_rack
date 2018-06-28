package com;
import java.util.*;

public class BinarySearchTree {

	TreeNode root;
	private static List<Integer> treenodes= new ArrayList<Integer>();

	public BinarySearchTree()
	{
		root=null;
	}

	public TreeNode buildBST(TreeNode node)
	{

		if(root==null)
		{
			root=node;
		}

		else{
			TreeNode temp=root;
			
			while(temp!=null)
			{
				if(temp.data>node.data)
				{
					if(temp.left==null)
						{
						temp.left=node;
						System.out.println(node.data+"  left of  "+temp.data);
						break;
						}
					else
					temp=temp.left;
				}
				else
				{
					if(temp.right==null)
						{
						temp.right=node;
						System.out.println(node.data+"  right of  "+temp.data);
						break;
						}
					else
					temp=temp.right;
				}
			}

		}

		return root;
	}
	
	public static boolean searchKey(BinarySearchTree bst,int data)
	{
		boolean isPresent=false;
		
		TreeNode temp= bst.root;
		
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			
			else
			{
				if(temp.data<data)
					temp=temp.right;
				else
					temp=temp.left;
			}
		}
		
		return isPresent;
	}
	
	public static void inorderTraversal(TreeNode root)
	{
		if(root==null)
			return ;
			inorderTraversal(root.left);
			treenodes.add(root.data);
			inorderTraversal(root.right);
			
	}
	private static int heightOfTree(TreeNode root) 
    {
        if (root == null) 
            return 0;
        else
        {
           
            int lheight = heightOfTree(root.left);
            int rheight = heightOfTree(root.right);
  
           
            if (lheight > rheight) 
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
	
	private static void zigzagTraversal(TreeNode node)
	{
		Stack<TreeNode> s1=new Stack<TreeNode>();
		Stack<TreeNode> s2=new Stack<TreeNode>();
		
		s1.push(node);
		
		while(!s1.empty() || !s2.empty())
		{
				while(!s1.empty())
				{
					TreeNode temp=s1.pop();
					System.out.print(temp.data+" ");
					//insert elements in s2 from right to left
					if(temp.right!=null)
						s2.push(temp.right);
					if(temp.left!=null)
						s2.push(temp.left);
				}
				
				while(!s2.empty())
				{
					TreeNode temp=s2.pop();
					System.out.print(temp.data+" ");
					//insert elements in s1 from left to right
					if(temp.left!=null)
						s1.push(temp.left);
					if(temp.right!=null)
						s1.push(temp.right);
				}
				
		}
		
		
	}
	
	public static int sumOfKSmallestNodes(BinarySearchTree bst,int k)
	{
		int sum=0;
		
		inorderTraversal(bst.root);
		
		for(int i=0;i<k;i++)
		{
			sum+=treenodes.get(i);
			System.out.println(treenodes.get(i));
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		BinarySearchTree bst= new BinarySearchTree();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int node=sc.nextInt();
		bst.buildBST(new TreeNode(node));
		}
		
		int key=sc.nextInt();
		System.out.println(searchKey(bst,key));
		
		int k=sc.nextInt();
		System.out.println(sumOfKSmallestNodes(bst, k));
		
		int h=heightOfTree(bst.root);
		System.out.println("Height of the BST "+h);
		zigzagTraversal(bst.root);
		
	}
	
	

}
