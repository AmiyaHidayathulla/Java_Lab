package OOPJLAB;

import java.util.*;

class DoublyLinkedList1 {    

    class Node
    {  
        int item;  
        Node previous;  
        Node next;  
        public Node(int item) 
         {  

            this.item = item;  
         }  
    }  
 Node head, tail = null;   
 public void addNode(int item) 
 {    
        Node newNode = new Node(item);  
        if(head == null) 
        {  
            head = tail = newNode;  
            head.previous = null;             
            tail.next = null;  
        }  
        else 
        {             
            tail.next = newNode;          
            newNode.previous = tail;            
            tail = newNode;             
            tail.next = null;  
        }  
        System.out.println(item+" is inserted");
    }  

    public void deleteNodes() 
    {
    	int x = head.item;
        head = head.next;
        System.out.println("Element "+x +" got deleted");
    } 
    public void printNodes() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("Doubly linked list is empty\n* * * * * * * * * * * * * * * *\n");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) 
        {  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
        System.out.println("\n");
    }  
}
public class DoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList1 obj=new DoublyLinkedList1();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Select the operation 1 to 3:\n1:addNode \t2:deleteNode \t3:displayNode \t4:Exit");
			System.out.print("Enter the operation you want to perform: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				 case 1:
					 System.out.print("Enter the element you want to insert: ");
				     int item=sc.nextInt();
					 obj.addNode(item);
					 obj.printNodes();
					 break;
				 case 2:
					 obj.deleteNodes();
					 obj.printNodes();
					 break;
				 case 3:
					 obj.printNodes();
					 break;
				 case 4:
					 System.out.println("Exited");
					 System.exit(0);
					 break;
				default:
					System.out.println("INVALID OUTPUT!!!\n");
					break;
			}
		}
	}
}
