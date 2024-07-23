public class Palindrome {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int idx){
        int size = getSize();
        if (idx < 0 || idx >= size) {
            System.out.println("please enter a valid index");
            return;
        }

        if (idx == 0 || head == null) {
           addFirst(data); 
           return;
        }

        Node newNode = new Node(data);

        Node prev = head;
        for(int i=0; i<idx-1; i++){
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void removeFirst(){
        int size = getSize();
        if (size == 0) {
            System.out.println("linked-list is empty");
            return;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            System.out.println(val+" val is removed");
            return;
        }

        int val = head.data;
        head = head.next;
        System.out.println(val+" val is removed");
        return;

    }

    public void removeLast(){
        int size = getSize();
        if (size == 0) {
            System.out.println("linked-list is empty");
            return;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println(val+" val is removed");
            return;
        }
        
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        System.out.println(val+" val is removed");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next; 
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    public int search(int key){
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head, int key, int idx){
        if (head == null || head.next == null) {
            return -1;
        }

        if (head.data == key) {
            return idx;
        }

        return helper(head.next,key, idx+1);
    }

    public int recurSearch(int key){
        return helper(head, key, 0);
    }


    public void removeNth(int n) {
        int size = getSize();

        // Edge-cases
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        if (n <= 0) {
            System.out.println("n should be greater than 0");
            return;
        }
        if (n > size) {
            System.out.println("n cannot be greater than size");
            return;
        }

        if (size == n) {
            int val = head.data;
            head = head.next;
            System.out.println(val + " val is removed");
            return;
        }

        Node temp = head;
        int i = 0;

        while (i < size - n - 1) {
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        System.out.println(val + " val is removed");
    }

    // Finding the mid of the linked list using slow fast approach
    // where slow pointer moves one step at a time 
    // And fast pointer moves two step at a time
    public Node midNode(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 step
        }

        return slow;
    }

    // checking if our ll is palindrome or not
    public boolean palindrome(){
        // if the linked has 0 or only one element so it's already a palindrome ll
        if (head == null || head.next == null) {
            System.out.println("linked is palindrome");
            return true;
        }

        // getting the mid node
        Node helper = midNode();

        // reverse from mid 
        Node prev = null;
        Node curr = helper;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        // System.out.println("linked list is palindrome");
        return true;
    }

    public int getSize(){
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        // System.out.println("size of the linked-list is: "+size);
        return size;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addFirst(4);
        // ll.addLast(5);

        // ll.print();

        // it will get the size of the linked list
        // ll.getSize(); 

        // System.out.println(ll.palindrome());
        
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.reverse();
        ll.print();

        // ll.print();
        // System.out.println("head data: "+head.data);
        // System.out.println("tail data: "+tail.data);

        // ll.reverse();
        
        // ll.print();
        // System.out.println("head data: "+head.data);
        // System.out.println("tail data: "+tail.data);
        
        // System.out.println(ll.recurSearch(56));

        ll.print();
        ll.removeNth(0);
        ll.print();
    }
}
