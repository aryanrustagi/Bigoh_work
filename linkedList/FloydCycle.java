package linkedList;

class FloydCycle {
    static Node detectCycle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    static void printList(Node head, Node cycleNode) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            if (current == cycleNode) {
                System.out.print("(cycle starts here) ");
                break;
            }
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next;

        Node cycleNode = detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected.");
        }

        printList(head, cycleNode);
    }
<<<<<<< HEAD
} // hello world
=======
}
>>>>>>> 86aebbb3102b766dd6c628f04755c037bf3945c1
