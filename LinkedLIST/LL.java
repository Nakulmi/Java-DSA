package LinkedLIST;

public class LL{

    // This is the way we create a Node in LINKED LIST
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
    public static int size;   // it's value is initialized as size = 0;

    // Method to AddFirst
    // We are not using STATIC because we are not calling the methods directly instead we call then using ll object
    public void addFirst(int data){
        //STEP 1 = create new node
        Node newNode = new Node(data);
        size++;

        // Case when Linked list in empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //STEP 2 = newNode's next is pointing towards head
        newNode.next = head;

        //STEP 3 = now newNode is head of LinkedList ll
        head = newNode;
    }

    // Method for AddLast
    public void addLast(int data){
        //STEP 1 = create new node
        Node newNode = new Node(data);
        size++;

        // Case when Linked list in empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //STEP 2 = tail's next is pointing towards newNode
        tail.next = newNode;

        //STEP 3 = now newNode is tail of LinkedList ll
        tail = newNode;
    }

    // Method to Print Linkedlist
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to add node in Middle
    public void addMiddle(int idx, int data){
        // When we want to add at first value of list, head will also change that's why we call the addFirst method
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to find SIZE of LL
    // public void size(){
    //     Node temp = head;
    //     int i =0;
    //     while(temp != null){
    //         temp = temp.next;
    //         i++;
    //     }
    //     System.out.println(i);
    // }
    
    // Method to remove first
    public int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        //prev : i = size-2
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Method to Search for a key (Iterative approach)
    public int itrSearch(int key){
        int i =0; 
        Node temp = head;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Methos to earch for a key (Recursive Approach)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // Method to reverse list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head; // Assignment in JAVA is Right to left so first head value is assigned in tail and, then tail value is assigned in curr
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Method to Delete nth node from End
    public void deleteNodefromLast(int n){
        if(n == size){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i =1; i<size-n; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return;
    }

    // Slow-Fast Concept
    public Node findMid(Node head){  // helper method to check a Palindrome LL
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;   //+1
            fast = fast.next.next;   //+2
        }
        return slow;  // slow is my midNode
    }
    // Method to find Palindrome LL
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //STEP 1 - find mid
        Node midNode = findMid(head);

        // STEP 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  // this will be head of 2nd half 
        Node left = head;

        // STEP 3 - check 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args){
        LL ll = new LL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        
        
        ll.printLL();
        System.out.println(ll.size);  // using a static variable avoids the use of a loop we do not have to make a extra method
        
        System.out.println(ll.checkPalindrome());
    }
}