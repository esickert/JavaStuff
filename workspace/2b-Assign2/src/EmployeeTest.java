public class EmployeeTest {
    public static void main(String[] args)  {

        Employee a = new Employee();
        Employee b = new Employee();

        a.setName("erich");
        System.out.println(a.getName());

        b.setName("eric");
        System.out.println(b.getName());

        a.setSsn("123.45.6789");
        a.setSalary(123.00);

        Employee c = new Employee("erik","111-11-1111",2.00);
        System.out.println(a.getName());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
/************************************************************************/
        EmployeeConsoleView d = new EmployeeConsoleView();
        d.setSsn("123.45.6789");
        System.out.println("I'm here line 24 " + d.getSsn());
        
        d.putConsoleInput(a);
        d.getConsoleInput(a);
                
        System.out.println();
        System.out.println(a);

    }
}
