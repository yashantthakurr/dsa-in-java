class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionFromEnd {
    Node head;
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAt(int index, String data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] hello) {
        DeletionFromEnd list = new DeletionFromEnd();
        list.insertAt(0, "Apple");
        list.insertAt(1, "Mango");
        list.insertAt(2, "Banana");
        list.insertAt(3, "Orange");
        list.insertAt(4, "Kiwi");
        list.display();
        list.deleteLast();
        list.display();
    }
}
