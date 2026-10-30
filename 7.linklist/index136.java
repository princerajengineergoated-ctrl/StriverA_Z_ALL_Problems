class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class index136 {

    // Function to reverse the linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            // Save the next node
            Node front = curr.next;

            // Reverse the current pointer
            curr.next = prev;

            // Move prev forward
            prev = curr;

            // Move curr forward
            curr = front;
        }

        return prev;
    }

    // Function to print linked list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Creating linked list
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}