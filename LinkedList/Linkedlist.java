class linkedlist {
    static class Node {
        int val;
        Node next;

        Node() {
            this.val = 0;
            this.next = null;
        }

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    static Node insertSorted(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null || val < head.val) {
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        while (curr.next != null && curr.next.val < newNode.val) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12, 7, 9, 25, 68, 34, 19, 5, 1, 22, 32, 15, 76, 34 };

        Node head = null;
        for (int num : arr) {
            head = insertSorted(head, num);
        }
        printList(head);
    }
}