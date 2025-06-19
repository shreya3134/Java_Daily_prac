public class AddingElements {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void add(int e) {
            Node temp = new Node(e);

            if (this.head == null) {
                this.head = temp;
            } else {
                Node curr = this.head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = temp;
            }
        }

        void print() {
            Node curr = this.head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.print();  // Output: 10 20 30 40
    }
}
