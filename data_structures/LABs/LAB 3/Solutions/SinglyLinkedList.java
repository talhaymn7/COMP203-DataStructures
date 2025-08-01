//Question 2: Total: 60 pt

public class Node<T> { // a 5pt
    T data;
    Node<T> next;

    public Node(T data) { // a 5pt
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList<T> { //b 5pt
    private Node<T> head;

    public SinglyLinkedList() {//b 5pt
        this.head = null;
    }
 
    public void append(T data) { // c 10pt
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }



    public void delete(T data) { // d 10 pt
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() { //e 10 pt
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) { 
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>(); //f 5 pt
        intList.append(1);
        intList.append(2);
        intList.append(3);
        intList.display();
        intList.delete(2);
        intList.display();

        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();//g 5 pt
        stringList.append("Apple");
        stringList.append("Banana");
        stringList.append("Cherry");
        stringList.display();
    }
}
