import java.util.Hashtable;




	public class Node
	{
		Node next = null;
		int data;
		
		public Node(int d)
		{
			data=d;
		}
	public void insert(int data)
	{
		Node recent= new Node(data);
		Node n=this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=recent;
	}
	
	public Node delete(Node head, int data)
	{
		Node n=head;
		while(n.next!=null)
		{
			if(n.next.data==data)
			{
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		
		
		return head;
		
	}
	
	public static void deleteDuplicates(Node head, int data)
	{
		Hashtable table =new Hashtable();	
		Node previous =null;
		while(head!=null)
		{
		if(table.containsKey(data)){
			
			previous.next=head.next;
		}
		else
		{
			table.put(data, true);
			previous=head;
		}
		head=head.next;
		
		}
	}
		
	public Node lasttok(Node head, int k)
	{
		Node ptr1=head;
		Node ptr2=head;
		for(int i=0;i<k-1;i++)
		{
			ptr2=ptr2.next;
		}
		while(ptr2!=null)
		{
		ptr1=ptr1.next;
		ptr2=ptr2.next;
		}
		return ptr1;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	}

}
