/**
* One object of this class represents one node in the linked list, class List,
* below.
*/
class ListNode  {
    private Object data;
// Holds whatever data is in each node

    private Object getData() {
        return data;
    }
    
    private void setData ( Object d )   {
        data = d;
    }

  // don't want these to be public!!     ????????????????????????????????????????
    private ListNode next; // Holds the reference to the next node in the List
    
    public ListNode getNext() {
        return next;
    }
    
    public void setNext( ListNode ln )    {
        next = ln;
    }
    public ListNode (Object d)    {
        initialize (d, null);
    }
    
    public ListNode (Object d, ListNode n)  {
        initialize(d, n);
    }
    
    private void initialize(Object d, ListNode n)   {
        setData(d);
        setNext(n);
    }
    
    public String toString ()   {
// Returns the data in one node
        return ""+getData();
// this automatically calls getData().toString()
    }
}

/*******************************************************************************/
/**
* One object of this class represents a linked list of ListNode objects, above.
*/
public class List   {
    private ListNode first;
    
// A reference to the first node in the list
    private ListNode getFirst() {
        return first ;
    }

    private void setFirst( ListNode newFirst) {
         first = newFirst;
    }
    public List ()  {
        setFirst( null);
    }
/**
* Makes a new node containing "d" and links it to the end of List.
*/
    public void addAtEnd (Object d) {
        if (getFirst() == null)
            setFirst (new ListNode ( d ));
        else if (getFirst().getNext() == null)
            getFirst().setNext(new ListNode ( d ));
        else   {
            ListNode temp = getFirst().getNext();
            while (temp.getNext() != null)
        // We know that (temp != null)
                temp = temp.getNext();
                temp.setNext( new ListNode ( d ));
        }
    }

    public String toString()    {
        ListNode temp = getFirst();
        String value = "";

        while (temp != null)    {
            value = value + " " + temp;
            temp = temp.getNext();
        }
        return value;
    }
}
