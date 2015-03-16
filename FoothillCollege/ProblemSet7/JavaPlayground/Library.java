import java.util.*;

class Library    {

    String address;
    ArrayList<String> bookList = new ArrayList<String>();

    Library()   {
    }  // end of constructor

    Library(String libraryAddress)   {
        address = libraryAddress;
    } // end of constructor
    
    public void printOpenHours()   {            //I don't understand "static"
        System.out.println("8:00am to 5:00pm, M-F");
    } 

    public ArrayList addBook(String book)    {         //this doesn't really work 
        bookList.add(book);
//        System.out.println(bookList);
//        System.out.println(bookList.get(0) + " inside addbook");
//        printAvaliableBooks(bookList);
        return bookList;
    }

    public void printAvaliableBooks()    {
        for (int i = 0; i < bookList.size(); i++)   {
            System.out.println(bookList.get(i));
        } //end of for loop
    } //end of method printAvaliableBooks
   

//} //end of class Library

    public static void main(String[] args)  {

        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        firstLibrary.addBook(new Book("The DeVinci Code").title);
        firstLibrary.addBook(new Book("Le Petit Prince").title);
        firstLibrary.addBook(new Book("The Lord of the Rings").title);
        firstLibrary.addBook(new Book("A Tale of Two Cities").title);
        
        Book test = new Book("This is a test");
        firstLibrary.addBook(test.title);
        test.borrowed = true;
        System.out.println(test.isBorrowed());

        secondLibrary.addBook(new Book("Dune").title);

        System.out.println("Library addresses:");
        System.out.println(firstLibrary.address);
        System.out.println(secondLibrary.address);
        System.out.println("Library hours:");        
        firstLibrary.printOpenHours();
                         
        System.out.println("Avaliable books at FirstLibrary are: ");
        firstLibrary.printAvaliableBooks();         //need to call method via firstLibrary

        System.out.println("Avaliable books at SecondLibrary are: ");
        secondLibrary.printAvaliableBooks();        //need to call method via secondLibrary
      //  System.out.println(firstLibrary.test.borrowed());
    } //end of main

} //end of class Library    
