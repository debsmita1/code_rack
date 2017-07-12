package com;


public class LinkedListIntersection {
	
	Node head;
	public LinkedListIntersection()
	{
		head=null;
	}
	
	public Node addNode(Node node)
	{
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=node;
		}
		
		return head;
		
	}
	
	
	
	
	public static void findIntersection(LinkedListIntersection a,LinkedListIntersection b)
	{
		Node temp=a.head;
		int aLength=0,bLength=0;
		while(temp.next!=null)
		{
			aLength++;
			temp=temp.next;
		}
		temp=b.head;
		
		while(temp.next!=null)
		{
			bLength++;
			temp=temp.next;
		}
		
		if(aLength-bLength>0)
		{
			int count=aLength-bLength;
			while(count>0)
			{
				a.head=(a.head).next;
				count--;
			}
		}
		else
		{
			int count=bLength-aLength;
			while(count>0)
			{
				b.head=(b.head).next;
				count--;
			}
		}
		
		int index=1;
		while(a!=null && b!=null){
		if(a.head.data==b.head.data)
		{
			System.out.print("index   "+index+"  Node   "+a.head.data);
			break;
		}
		else
		{
			index++;
			a.head=a.head.next;
			b.head=b.head.next;
		}
		}
		
	}
	public static void main(String args[])
	{
		LinkedListIntersection a= new LinkedListIntersection();
		
		LinkedListIntersection b= new LinkedListIntersection();
		
		a.addNode(new Node(64));
		a.addNode(new Node(11));
		a.addNode(new Node(45));
		a.addNode(new Node(89));
		a.addNode(new Node(80));
		a.addNode(new Node(70));
		
		
		
		b.addNode(new Node(33));
		b.addNode(new Node(56));
		b.addNode(new Node(80));
		b.addNode(new Node(70));
		
		
		findIntersection(a, b);
	}

}




