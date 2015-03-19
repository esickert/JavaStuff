public class Book   {

    String title;
    boolean borrowed;
    

    Book()  {   
    }   //end of constructor

    public Book(String bookTitle)  {    //constructors returns nothing
        title = bookTitle;
    }

    String getTitle()   {   
        return title;
    } // end of getTitle

    public void borrowed()  {       
        borrowed = true;
    } //end of borrowed

    public void returned()  {
        borrowed = false;
    } //end of returned

    boolean isBorrowed()    {   
        if (borrowed)
            return true;
        else return false;
    }

    public static void main(String[] args)    {

        Book example = new Book("The DeVinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        System.out.println(example.title);

    } //end of main
} // end of class Book
