import java.text.DecimalFormat;
//THIS IS NOT RIGHT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! LOGIC IS WRONG??!!!!!!!!
public class Node  {  //page 892 in Wu's book .pdf

// this is a node only. the "linklist" is a separate class

    Employee worker = new Employee();
    Node next; //  WHY  is "next" type Node??????? Wu's book!!

    public int count = 0;

    public Node()   {  
<<<<<<< HEAD
//        this setEmployee(worker);
=======
//        this (setEmployee(worker));
>>>>>>> linux
        next = null;
    }

    public Node(Employee worker, Node node)    {
        setEmployee(worker);
        setNext(node);
        count++;
    }
/******************************************************************************/
    public Node getNext()   {
        return next;
    }

    public Employee getEmployee()    {
        return worker;
    }
    
/******************************************************************************/
    public void setEmployee(Employee a) {   //this is not right!!!!!!!!!
        worker = a;
    } 
    
    public void setNext(Node node)  {
        next = node;
    }
}
