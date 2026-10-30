class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class index135 {

    public static ListNode middleNode(ListNode head) {

        int count = 0;

        ListNode temp = head;

        // First traversal: Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find middle position
        int middle = count / 2;

        // Reset temp to head
        temp = head;

        // Second traversal: Reach middle
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Creating linked list
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original Linked List:");
        printList(head);

        // Find middle node
        ListNode middle = middleNode(head);

        System.out.println("Middle Node: " + middle.val);
    }
}