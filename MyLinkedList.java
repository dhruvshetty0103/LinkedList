package com.linkedlist.linekedlist;
public class MyLinkedList<K> 
{
	static Node head; // head of list
	 
    /* Linked list Node*/
    public static class Node 
    {
        int data;
        Node next;
 
        /* Constructor to create a new node
         * Next is by default initialized as null
        */ 
        Node(int d) 
        { 
        	data = d;
        }
    }
}