//Classical doubly linked list node class.
class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

//The doubly linked list class as asked. 

class CDoublyLinkedList<T> { 
    private Node<T> header;

    public CDoublyLinkedList() {
        header = new Node<>(null);
        header.next = header;
        header.prev = header;
    }


    //Adding to the end function
    public void append(T data) { 
        Node<T> newNode = new Node<>(data);
        Node<T> last = header.prev;

        newNode.next = header;
        newNode.prev = last;

        last.next = newNode;
        header.prev = newNode;
    }

    //Deleting a specific value from the CDLL
    public void delete(T data) {
        Node<T> current = header.next;

        while (current != header) {
            if (current.data.equals(data)) {
                Node<T> prevNode = current.prev;
                Node<T> nextNode = current.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;

                return; // Node deleted, exit the function
            }
            current = current.next;
        }
    }

    //Printing the CDLL
    public void display() {
        Node<T> current = header.next;
        System.out.print("header <-> ");
        while (current != header) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.print("header" +"\n");
    }


    //Main function to test our code
    public static void main(String[] args) {
        // String type CDLL
        CDoublyLinkedList<String> StrCDLL = new CDoublyLinkedList<>();
        StrCDLL.append("hello");
        StrCDLL.append("from");
        StrCDLL.append("the earth");
        StrCDLL.display(); // header <-> "hello" <-> "from" <-> "the earth" <-> header
        StrCDLL.delete("from");
        StrCDLL.display(); // header <-> "hello" <-> "the earth" <-> header

        // Integer type CDLL
        CDoublyLinkedList<Integer> IntCDLL = new CDoublyLinkedList<>();
        IntCDLL.append(4);
        IntCDLL.append(8);
        IntCDLL.append(15);
        IntCDLL.append(16);
        IntCDLL.display(); // header <-> 4 <-> 8 <-> 15 <-> 16 <-> header
        IntCDLL.delete(8);
        IntCDLL.display(); // header <-> 4 <-> 15 <-> 16 <-> header
    }
}



/*
h.1) The Big-O worst case complexity is O(1)because we have reference to the tail via header.prev .
h.2) Sicne we are looking for a specefic value, we need to check every single data to find that data. That makes O(n) for the wrost time complexity.
h.3) Hence we need to print out every single value, time comlexity of display function is O(n)



*/
