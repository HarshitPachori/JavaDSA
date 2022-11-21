class DeleteNodeInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    Node deleteANode(Node head, int val) {
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
        DeleteNodeInLinkedList dnll = new DeleteNodeInLinkedList();
        Node a = new Node(1);
        dnll.head = a;
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        dnll.printList(dnll.head);
        dnll.deleteANode(a, 3);
        dnll.printList(dnll.head);

    }
}