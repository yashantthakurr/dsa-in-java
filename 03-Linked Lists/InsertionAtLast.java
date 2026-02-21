class MyNode {
    String data;
    MyNode next;
    MyNode (String data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionAtLast {
    MyNode head;
    public void addLast(String data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
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
        InsertionAtLast list1 = new InsertionAtLast();
        InsertionAtLast list2 = new InsertionAtLast();

        list1.addLast("Apple");
        list1.addLast("Mango");
        list1.addLast("Banana");
        list1.addLast("Litchi");

        list2.addLast("Orange");
        list2.addLast("Strawberry");
        list2.addLast("Grape");
        list2.addLast("Kiwi");

        System.out.println("Linked List 1: ");
        list1.display();
        System.out.println("Linked List 2: ");
        list2.display();
    }
}

