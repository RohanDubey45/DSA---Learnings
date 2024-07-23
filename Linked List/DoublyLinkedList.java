public class DoublyLinkedList {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){ 
        // create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("DLL is empty");
        }
        
        int val = head.data;

        if (head.next == null) {
            head = tail = null;
            size = 0;
            System.out.println(val+ " is removed");
            return;
        }
        
        head = head.next;
        head.prev = null;
        size--;
        System.out.println(val+ " is removed");
    }

    public void addLast(int data){
        // create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeLast(){
        // linked list is empty
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }

        // linked list has only one element
        if (head.next == null) {
            head = tail = null;
            size = 0;
            return;
        }
        
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);

        dll.print();

        dll.removeLast();
        dll.removeLast();
        dll.print();
        // System.out.println(dll.size);

    }
}
