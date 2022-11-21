public class ReverseLinkedlist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    Node reverseList(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    public static void main(String[] args) {
        ReverseLinkedlist rvl=new ReverseLinkedlist();
        rvl.head = new Node(0);

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        rvl.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        rvl.printList(rvl.head);
        Node res = rvl.reverseList(rvl.head);
        rvl.printList(res);
    }

}
