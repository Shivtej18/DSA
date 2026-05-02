package Linked_List;

import java.util.LinkedList;

public class Linked {
    // Node = one element
    // Linked = manages full list
    // Node stores data, Linked manages the list.
    // Linked List (Java) – Quick Notes
    // Node class
    // Represents a single element
    // Contains:
    // data
    // next pointer
    // Only used as a building block
    // Linked class (Main class)
    // Represents the entire linked list
    // Contains:
    // head (start of list)
    // tail (end of list)
    // Implements operations like:
    // addFirst()
    // addLast()
    // delete()

    public static class Node {
        int Data;
        Node Next;

        // Constructor
        Node(int Data) {
            this.Data = Data;
            this.Next = null;
        }
 
    }

    // There is only one head and only one tail in LL therefore we can define them
    // within class itself.
    Node head;
    Node tail;

    public void addFirst(int Data) {
        // step 1: creaete new node
        Node newNode = new Node(Data);
        // If empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 :Link-> Newnode next = head
        newNode.Next = head;
        // step 3 : head = newnode
        head = newNode;

    }

    // helper to check
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Linked ll = new Linked();
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
    }

}
