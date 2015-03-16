import java.util.*;

class Library    {

    String address;
    ArrayList<Book> bookList = new ArrayList<Book>();

    Library()   {
    }  // end of constructor

    Library(String libraryAddress)   {
        address = libraryAddress;
    } // end of constructor
    
    public void printOpenHours()   {            //I don't understand "static"
        System.out.println("Libraries are open daily from 9am to 5pm.");
    } 

    public ArrayList addBook(Book book)    {         //this doesn't really work..now it does 
        bookList.add(book);
        return bookList;
    } //end of addBook()
  
    public void printAvaliableBooks()    {
        for (int i = 0; i < bookList.size(); i++)   {
            if (bookList.get(i).isBorrowed() == false)
                System.out.println('"' + bookList.get(i).title + '"');
            else    {
                System.out.println("\"" + bookList.get(i).title + "\" - checked out.");
            } //end of ifelse
        } //end of for loop
    } //end of method printAvaliableBooks
   

//} //end of class Library

    public static void main(String[] args)  {

        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        firstLibrary.addBook(new Book("The DeVinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        
 //       Book GWTW = new Book("Gone with the Wind");
        firstLibrary.addBook(new Book("Gone with the Wind"));
//        firstLibrary.GWTW.borrowed = true;
        firstLibrary.bookList.get(2).borrowed = true;
        secondLibrary.addBook(new Book("Dune"));
        secondLibrary.bookList.get(0).borrowed = true;

        System.out.println("Library addresses:");
        System.out.println(firstLibrary.address);
        System.out.println(secondLibrary.address);
        System.out.println();

        System.out.println("Library hours:");        
        firstLibrary.printOpenHours();
        System.out.println(); 
                
        System.out.println("Books available in the first library:");
        firstLibrary.printAvaliableBooks();         //need to call method via firstLibrary
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvaliableBooks();        //need to call method via secondLibrary
        System.out.println();
    } //end of main

} //end of class Library    
