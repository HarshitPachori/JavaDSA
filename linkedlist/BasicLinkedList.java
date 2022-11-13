
class BasicLinkedList {
    class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;
        }
    }

    Node head;

    void insAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void insAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        BasicLinkedList list = new BasicLinkedList();
        list.insAtFirst(5);
        list.insAtFirst(4);
        list.insAtFirst(3);
        list.insAtFirst(2);
        list.insAtFirst(1);
        list.printList();

    }

}