class StudentID {
    int id;
    String name;

    StudentID(int id, String name)  { // a constructor
        this.id = id;
        name = name;
    }

    void display()   {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args)  {

        StudentID test1 = new StudentID(111, "Steve");
        StudentID test2 = new StudentID(222, "Mary");

        test1.display();    
        test2.display();
    } //end of main
} //end of class

        
