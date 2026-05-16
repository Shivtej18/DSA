package Linked_List;

public class Linked {

    public int size; // removed static

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // ✅ Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    // ✅ Add Last (NEW METHOD)
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // ✅ Print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ✅ Remove First
    public void removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        size--;
    }

    // Remove Last
    public void removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size = 0;
            return; // IMPORTANT
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;
    }

    // Remove Nth from last
    public void removeNthLast(int n) {
        int sz = 0;
        Node temp = head;

        // calculate size
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // remove first node
        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // remove node
        prev.next = prev.next.next;
    }

    public static void main(String args[]) {
        Linked ll = new Linked();

        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // ll.print(); // 1 -> 2 -> 2 -> null
        // System.out.println(ll.size);

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.removeNthLast(3);

        ll.print();
    }
}