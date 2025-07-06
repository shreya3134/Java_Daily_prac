
public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    // Inner class for Node
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return length == 0; // or head == null
    }

    // Insert node at the start
    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
        length++;
    }
    
    // Insert node at the end
    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    // Delete the first node
    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    
    
    // Deleting last node
    
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new java.util.NoSuchElementException();
        }
        ListNode temp = head;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        length--;
        return temp;
        
    }
    
    



    // Display list from head to tail
    public void displayForward() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Display list from tail to head
    public void displayBackward() {
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.println("null");
    }

    // Main method to test the list
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(10);
        dll.insertLast(18);
        dll.insertLast(35);
        dll.insertLast(45);
        
        dll.displayForward();
        dll.displayBackward();
        
        dll.insertFirst(1);
        
        dll.displayForward();
      
        
        dll.deleteLast();
        dll.displayForward();
       
        
        dll.deleteFirst();
        dll.displayForward();
        
    }
}