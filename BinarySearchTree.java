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
		
		bst.buildBST(new TreeNode(90));
		bst.buildBST(new TreeNode(45));
		bst.buildBST(new TreeNode(60));
		bst.buildBST(new TreeNode(110));
		bst.buildBST(new TreeNode(100));
		bst.buildBST(new TreeNode(96));
		bst.buildBST(new TreeNode(34));
		bst.buildBST(new TreeNode(80));
		
		int key=sc.nextInt();
		System.out.println(searchKey(bst,key));
		
		int k=sc.nextInt();
		System.out.println(sumOfKSmallestNodes(bst, k));
		
	}
	
	

}
