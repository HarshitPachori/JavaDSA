public class IntersectionPointInLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    int intersectionPoint(Node node1, Node node2) {
        Node ptr1 = node1;
        Node ptr2 = node2;
        if (node1 == null || node2 == null) {
            return -1;
        }
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if (ptr1 == ptr2) {
                return ptr1.data;
            }
            if (ptr1 == null) {
                ptr1 = node2;
            }
            if (ptr2 == null) {
                ptr2 = node1;
            }
        }
        return ptr1.data;

    }
}
