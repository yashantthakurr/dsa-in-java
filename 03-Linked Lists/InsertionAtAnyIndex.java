class MyNode {
    String data;
    MyNode next;
    MyNode(String data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionAtAnyIndex {
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
            System.out.printf("Cannot add %s. Index out of bounds!\n", data);
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
    public static void main(String[] args) {
        InsertionAtAnyIndex list = new InsertionAtAnyIndex();

        list.insertAtIndex(0, "Apple");
        list.display();

        list.insertAtIndex(1, "Mango");
        list.display();

        list.insertAtIndex(2, "Banana");
        list.display();

        list.insertAtIndex(2, "Kiwi");
        list.display();

        list.insertAtIndex(10, "Litchi");
    }
}
