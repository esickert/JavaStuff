import java.util.*;

public class StringClasses  {

    int capacity = 5;
    ArrayList test = new ArrayList(capacity);
    
    StringClasses() {
    }
    
    StringClasses(ArrayList a)  {
        test = a;
    }
    
    public void printAList(ArrayList b) {
        for(int i = 0; i <= b.size() - 1; i++)  {
            System.out.println("This is inside class StringClasses " + b.get(i));
        }
    }
}
