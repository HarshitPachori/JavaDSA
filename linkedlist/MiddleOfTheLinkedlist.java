public class MiddleOfTheLinkedlist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    int middleOfLinkedlist() {
        Node temp = head;
        int middle;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        middle = len / 2;
        temp = head;
        while (middle != 0) {
            temp = temp.next;
            middle--;
        }
        return temp.data;

    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        MiddleOfTheLinkedlist motl = new MiddleOfTheLinkedlist();
        motl.head=new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        motl.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        System.out.println(motl.middleOfLinkedlist());
        motl.printList();
    }
}
