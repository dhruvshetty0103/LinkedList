package com.linkedlist.linekedlist;
public class MyLinkedList<K> 
{
	static Node head; // head of list
	 
    /* Linked list Node
     * Constructor to create a new node
     * Next is by default initialized as null
    */
    public static class Node 
    {
        int data;
        Node next;
        Node(int d) 
        { 
        	data = d;
        }
    }
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
        	// Else traverse till the last node and insert the new_node there and Insert the newNode at last node
            Node last = list.head;
            while (last.next != null) 
            	last = last.next;
            last.next = newNode;
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
    
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        MyLinkedList list = new MyLinkedList();
   
        // Insert the values
        list = insert(list,56);
        list = insert(list,30);
        list = insert(list,70);
   
        // Print the LinkedList
        printList(list);
    }
}