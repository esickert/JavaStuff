import java.util.*;

public class LinkedList {
    public static void main(String[] args)  {

        Node head, succeeding, tail;
        head = new Node();
        head.next = null;
        System.out.println(head.worker + " line 9\n");
        tail = head;
        succeeding = new Node();
        head.setNext(succeeding);
        System.out.println(succeeding.worker + " line 13\n");
        succeeding.setNext(tail);
        System.out.println(tail.worker + " line 15\n");
          
    }
}


