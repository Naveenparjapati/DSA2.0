package Sir_Program;


class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Reverse_a_liked_list {
    public static void main(String[] args) {
        // Example Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Before reversing
        System.out.println("Original List:");
        printList(head);

        // Reversing the linked list
        head = reverseList(head);

        // After reversing
        System.out.println("Reversed List:");
        printList(head);
    }

    // Iterative approach to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // Save next node
            next = current.next;
            
            // Reverse current node's pointer
            current.next = prev;
            
            // Move pointers one position ahead
            prev = current;
            current = next;
        }

        return prev;  // prev will be the new head of the reversed list
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
