public class LinkedList {
    public static void main(String[] args)  {

        Node n = new Node();
        System.out.println(n.worker + " line 5");
        System.out.println(n.next + " line 6");
        n.worker.setName("Harry");
        n.worker.setSsn("I think this is the idea");
        System.out.println(n.worker + " line 9");
        System.out.println(n.getNext());

        
//        System.out.println(a.getNext() + "\n");
        
//        System.out.println("This is a 3 node linked list!!!" + "\n");
//        Node head = new Node("steve", "1234", 12345, null);
//        Node tail = new Node("samantha", "12345", 1234, null);
//        Node next = new Node("jane", "345", 1234, null);
          Node p;
          p = new Node();
//        head.setNext(next);
//        next.setNext(tail);
//        tail.setNext(null);
          p = p.getNext();
          System.out.println(p + " This is p = p.getNext()\n");
 //       System.out.println(head);
//        System.out.println(head.getNext());
//        System.out.println(next.getNext());
 //       System.out.println("Number of items in list: " + count); */

    }
}
        
