class MyNode {
    String data;
    MyNode next;
    MyNode(String data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionFromBeginning {
    MyNode head;
    public void addFirst(String data) {
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtIndex(int index, String data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        MyNode newNode = new MyNode(data);
        MyNode current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.printf("Cannot insert %s. Index out fo bounds.\n", data);
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display() {
        MyNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void deleteFromBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        DeletionFromBeginning list = new DeletionFromBeginning();

        list.addFirst("Apple");
        list.insertAtIndex(1, "Mango");
        list.insertAtIndex(2, "Banana");
        list.insertAtIndex(3, "Kiwi");
        list.insertAtIndex(4, "Grape");
        list.insertAtIndex(5, "Orange");
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.display();
    }
}
