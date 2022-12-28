import java.util.LinkedList;

public class linkedlistPalindrome {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Node head;

    Node reverse(Node node) {
        Node curr = node, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("Null\n");
    }

    boolean ispalindrome(Node head1, Node head2) {
        Node a = head1, b = head2;
        boolean flag = false;
        while (a != null && b != null) {
            if (a.data != b.data) {
                flag = false;
                break;
            } else {
                flag = true;
                a = a.next;
                b = b.next;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        linkedlistPalindrome llp = new linkedlistPalindrome();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(2);
        Node g = new Node(1);
        llp.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        llp.printList(llp.head);
        Node newhead = llp.reverse(llp.head);
        llp.printList(newhead);
        llp.ispalindrome(newhead, llp.head);
        boolean res = llp.ispalindrome(llp.head, newhead);
        System.out.println(res + "res");
        if (res) {
            System.out.println("Yes it is a palindrome");
        } else {
            System.out.println("No it is a palindrome");

        }

    }
}
