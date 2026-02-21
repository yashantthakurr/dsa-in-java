class MyNode {
    String data;
    MyNode next;
    MyNode(String data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertionAtBeginning {
    MyNode head;
    public void addFirst(String data) {
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
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
        InsertionAtBeginning myList = new InsertionAtBeginning();

        myList.addFirst("Apple");
        myList.display();

        myList.addFirst("Mango");
        myList.display();

        myList.addFirst("Banana");
        myList.display();

        myList.addFirst("Kiwi");
        myList.display();
    }
}
