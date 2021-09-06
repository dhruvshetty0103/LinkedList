package com.linkedlist.linekedlist;
public class MyLinkedList<K> 
{
	static Node head; // head of list
	 
    /* Linked list Node*/
    public static class Node 
    {
        int data;
        Node next;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) 
        { 
        	data = d;
        }
    }
    // Method to insert a new node
    public static MyLinkedList insert(MyLinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
   
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) 
        	list.head = new_node;
        else 
        {
        	// Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) 
            	last = last.next;
            // Insert the new_node at last node
            last.next = new_node;
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
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }
    
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        MyLinkedList list = new MyLinkedList();
   
        // Insert the values
        list = insert(list, 56);
        list = insert(list, 30);
        list = insert(list, 70);
   
        // Print the LinkedList
        printList(list);
    }
}