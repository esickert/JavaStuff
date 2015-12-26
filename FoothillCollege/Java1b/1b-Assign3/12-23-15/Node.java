import java.text.DecimalFormat;

public class Node  {  //page 892 in Wu's book .pdf
// this is a node only. the "linklist" is a separate class
    private String name;
    private String ssn;
    private double salary;
    private Node next; //  WHY  is "next" type Node??????? Wu's book!!

    public int count = 0;

    public Node()   {  
        //next = null;
        this("","",0, null);  //this is very cool!!!!! Same as above.
        count++;
    }

    public Node(String name, String ssn, double salary, Node node)    {
        setName(name);   //these are method calls. See below.
        setSsn(ssn);
        setSalary(salary);
        setNext(node);
        count++;
    }

    public String getName()    {
        return name;
    }

    public String getSsn()  {
        return ssn;
    }

    public String getSalary()   {
        DecimalFormat df = new DecimalFormat("0.00");
		return df.format(salary);  
    }
     
    public Node getNext()   {
        return next;
    }

    public void setName(String newName)   {
        name = newName;
    }

    public void setSsn(String newSsn)  {
        ssn = newSsn;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }
    
    public void setNext(Node node)  {
        next = node;
    }

    public String toString()   {
        String result = "Name: " + this.getName() 
               + "\nSocial Security: "  + this.getSsn()
               + "\nSalary: $" + this.getSalary() + "\n";
        return result;
    }
}
//******************************************************************************
