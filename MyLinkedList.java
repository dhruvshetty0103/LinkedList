package com.linkedlist.linekedlist;
/* Linked list Node
 * Constructor to create a new node
 * Next is by default initialized as null
*/
class Node 
{
    int data;
    Node next;
    Node(int d) 
    { 
    	data = d;
    }
}
public class MyLinkedList<K> 
{
	static Node head; // head of list
    
	// Method to insert a new node
    public static MyLinkedList insert(MyLinkedList list, int data)
    {
        // Create a new node with given data
    	Node newNode = new Node(data);
        newNode.next = null;
        // If the Linked List is empty,then make the new node as head
        if (list.head == null) 
        	list.head = newNode;
        else 
        {
        	// Insert the newNode between first and last nodes
        	newNode.next=head.next;
        	head.next=newNode;
        }
        // Return the list by head
        return list;
    }
   
    // Method to print the LinkedList.
    public static void printList(MyLinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) 
        {
            // Print the data at current node and go to next node
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    
    public static MyLinkedList pop(MyLinkedList list)
    {
    	Node deleteNode=list.head;
    	head=deleteNode.next;
    	return list;
    }
    
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        MyLinkedList list = new MyLinkedList();
   
        // Insert the values
        list = insert(list,56);
        list = insert(list,70);
        list = insert(list,30);
   
        // Print the LinkedList
        printList(list);
        list.pop(list);
        System.out.println("\nAfter deleting head node");
        printList(list);
    }
}