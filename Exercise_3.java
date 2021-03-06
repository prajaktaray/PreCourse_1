// Time Complexity : O(n)
// Space Complexity : O(n) where n is the size of the linked list
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
    	// Create a new node with given data 
    	Node curr = new Node(data) ;
    	
    	// If the Linked List is empty, 
        // then make the new node as head 
    	if (list.head == null)
    		list.head = curr;
    	
    	// Else traverse till the last node 
        // and insert the new_node there 
    	// Insert the new_node at last node 
    	else {
    		Node prev = list.head;
    		while(prev.next != null) {
    			prev = prev.next;
    		}
    		prev.next = curr;
    		
    	}
    	// Return the list by head
    	return list;	           
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
    	if (list.head == null) {
    		System.out.println("List is empty");
    		return;
    	}
    	
    	Node curr = list.head;    	
    	System.out.println("Contents of the list	:	");
    	while(curr != null) {
    		System.out.print(curr.data + "\t");
    		curr = curr.next;
		}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
