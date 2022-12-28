class RemoveDeuplicateInSortedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    Node removeDuplicateSimple(Node head) {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (curr != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;

        }

        return head;
    }

    Node removeDuplicateUsingRecursion(Node head, int val) {
        Node curr = head;
        while (curr != null) {
            if (val == curr.next.data) {
                break;
            }
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }

    void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("Null\n");
    }

    public static void main(String[] args) {
        RemoveDeuplicateInSortedList rmsl = new RemoveDeuplicateInSortedList();
        Node a = new Node(1);
        rmsl.head = a;
        a.next = new Node(2);
        a.next = new Node(2);
        a.next.next.next = new Node(3);
        a.next.next.next.next = new Node(4);
        rmsl.printList(rmsl.head);
        rmsl.removeDuplicateSimple(a);
        rmsl.printList(rmsl.head);
        rmsl.removeDuplicateUsingRecursion(a, 3);
        rmsl.printList(rmsl.head);
    }
}