public class CheckLinkedlistPalindrome {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    Node reverseLL(Node node) {
        Node curr = node, next = null, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    boolean isPalindromeLL(Node node) {
        int size = 0;
        Node curr = node;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int mid = size % 2 == 0 ? size / 2 : (size + 1) / 2;
        for (int i = 1; i < mid; i++) {
            curr = curr.next;
        }
        Node revHead = reverseLL(curr);
        curr = node;
        while (curr != null && revHead != null) {
            if (curr.data == revHead.data) {
                revHead = revHead.next;
                curr = curr.next;
            } else {
                return false;
            }
        }
        return true;

    }

}
