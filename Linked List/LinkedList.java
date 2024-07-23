public class LinkedList{

    public static class Node{
        int data; 
        Node next; // it is a reference varibable which points to next node or null

        public Node(int data){
            this.data = data;
            this.next = null; // null means empty
        }
    }

    // created two Node type variables head and tail where head is the first element & tail is the last element
    public static Node head;
    public static Node tail;
    public static int size;

    // adding a element at start position in linked list Tc O(1)
    public void addFirst(int data){  
        // step 1 - create a new node
        Node newNode = new Node(data);  // n1 is new node
        size++;

        // if there is no node means link-list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newnode next to the head
        newNode.next = head; // link
        
        // step 3 - assign head as new node
        head = newNode;
    }

    // adding a element at last position in linked list Tc O(1)
    public void addLast(int data){
        // step 1 - is to create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){      // if head or tail is empty
            head = tail = newNode;
            return;
        }

        // step 2 - is tail's next will point to new node
        tail.next = newNode;

        // step 3 - tail will be my new node
        tail = newNode;
    }

    // printing a linked list Tc - O(n)
    public void print(){        
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next; 
        }

        System.out.println("null");
    }

    // adding a element in middle of linked list Tc - O(n)
    public void addMiddle(int idx,int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode; 
    }


    public void removeFirst(){ // O(1)
        // removing starting element from linked list garbage collector will delete it
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println(val+" is removed from ll.");
            return;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        System.out.println(val+" is removed from ll.");
    }

    public void removeLast(){
        //means no element in the linked list
        if (size == 0) {
            System.out.println("linked list is empty");
        }

        // means only one element in the linked list
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            System.out.println(val+ " is removed");
        }

        // for the rest of elements
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        System.out.println(val+ " is removed");
    }

    // Iterative search for a key in a linked list Tc - O(n)
    public int search(int key){ 
        int i=0;
        Node temp = head;
        while (temp != null) {
            // key found case
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found case
        return -1;
    }

    // searching a key using recursion Tc - O(n)
    public int helper(Node head, int key, int idx){
        // base case if we reach to null and target is not found so return -1
        if (head == null || head.next == null) {
            return -1;
        }

        // target found return the index of the target
        if (head.data == key) {
            return idx;
        }

        return helper(head.next, key, idx+1);
    }

    public int recursiveSearch(int key){
        return helper(head, key, 0);
    }

    // Reverse a linked list
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

    public void removeNth(int n){  // O(n)
        // calculating the size of linked list
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // if size and n are same it means head is need to be deleted
        if (n == size){  
            head = head.next;
            return;
        }

        // calculating the prev index of n and linking that index to the next of n
        int i = 0;
        int idxtofind = size-n-1;
        Node temp1 = head;
        while (i < idxtofind) {
            temp1 = temp1.next;
            i++;
        }

        int val = size-n+1; // val will be deleted or removed

        temp1.next = temp1.next.next;
        System.out.println(val+" is deleted.");
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void remCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle == false) {
            System.out.println("Cycle does not exists");
            return;
        }

        slow = head;
        Node prev = null;

        // meeting point 
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        } 

        prev.next = null;
        
    }

    // this function will find mid of the linked list
    private Node getMidNode(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }   
        return slow;
    }

    public Node MergeSortLL(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMidNode(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node left = MergeSortLL(head);
        Node right = MergeSortLL(rightHead);

        return mergeList(left, right);
    }

    private Node mergeList(Node lhead, Node rhead){
        // creating a dummy node -1
        Node temp = new Node(-1);
        Node dummy = temp;

        while (lhead != null && rhead != null) {
            if (lhead.data <= rhead.data) {
                temp.next = lhead;
                lhead = lhead.next;
                temp = temp.next;
            }
            else{
                temp.next = rhead;
                rhead = rhead.next;
                temp = temp.next;
            }
        }

        while(lhead != null){
            temp.next = lhead;
            lhead = lhead.next;
            temp = temp.next;
        }

        while (rhead != null) {
            temp.next = rhead;
            rhead = rhead.next;
            temp = temp.next;
        }
        
        // returning next of temp bcz at start there is -1 node 
        return dummy.next;
    }

    public void zigzag(){
        // Step-1 Find the mid-node of the ll
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node right = mid.next;
        mid.next = null;

        // Step-2 Reverse the second half after mid
        Node prev = null;
        Node curr = right;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rhead = prev;
        
        // Step-3 zigzag approach
        Node lhead = head;
        Node nleft;
        Node nRight;

        while (lhead != null && rhead != null) {
            nleft = lhead.next;
            nRight = rhead.next;
            lhead.next = rhead;
            rhead.next = nleft;
            lhead = nleft;
            rhead = nRight;
        }

    }
    public static void main(String[] args) {

       LinkedList ll = new LinkedList();  // initialise object of LinkedList class

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addMiddle(2, 9);

        // ll.print(); // if linked list is empty it prints null

        // System.out.println("size is: "+ll.size);

        // ll.removeFirst();
        // System.out.println("size is: "+ll.size);

        // ll.removeLast();
        // System.out.println("size is: "+ll.size);

        // ll.print();

        // iterative search for a key in a linked list
        // System.out.println(ll.search(5));
        // System.out.println(ll.search(30));

        // ll.addFirst(5);
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(6);

        // ll.print();
        // System.out.println(ll.recursiveSearch(6));
        // ll.reverse();
        // ll.print();

        // ll.removeNth(5);
        // ll.print();

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head.next;
        
        
        // // ll.print();
        // System.out.println(isCycle());
        // remCycle();
        // System.out.println(isCycle());
        
       

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        // merge sort on ll
        // ll.print();
        // head = ll.MergeSortLL(head);
        // ll.print();

        ll.print();
        ll.zigzag();
        ll.print();



    }

}