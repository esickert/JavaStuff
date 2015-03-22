/***********************************************************************
/*  Assignment 7b                                     Erich Sickert
/*                                                             
/*  This is the second class, Library, of the 2 class assignmnent.
/*  It uses the book class as objects and store those in an arraylist.
/*  I useed an arraylist as the structure can expand and contract with
/*  each addition or removal of a book. I tried to follow the guidelines
/*  set by the assignment description.
/*
/*  NOTE: I set this program up to accept input from the user. It asks
/*  for a book title and then will delete that title if in the Library. 
/*  It then will automatically add it back to demonstrate that 
/*  functionality. Bool lists are displayed afetr each functionality. 
/***********************************************************************/

import java.util.*;

class Library    {

    String address;
    ArrayList<Book> bookList = new ArrayList<Book>();

    Library()   {
    }  // end of constructor

    Library(String libraryAddress)   {
        address = libraryAddress;
    } // end of constructor
    
    public void printOpenHours()   {           
        System.out.println("Libraries are open daily from 9am to 5pm.");
    } 

    public ArrayList addBook(Book book)    {         
        bookList.add(book);
        return bookList;
    } //end of addBook()
  
    public void borrowAvaliableBook(String bookTitle)  {
        for (int i = 0; i < bookList.size(); i++)   {
            if (bookList.get(i).title.equals(bookTitle))    {  
                System.out.println(bookTitle + " is avaliable");
                System.out.println("Borrowing " + bookTitle);
                System.out.println("You've succesfully borrowed " + bookTitle); 
                bookList.get(i).borrowed = true;
            } //end of if block
        } //end of for loop
    } // end of method

    public void returnBook(String bookTitle)    {
        for (int i = 0; i < bookList.size(); i++)   {
            if (bookList.get(i).title.equals(bookTitle))    
                bookList.get(i).borrowed = false;
        } //end of for loop
    } //end of method returnBook
            

    public void printAvaliableBooks()    {
        if (bookList.size() == 0)
            System.out.println("No books in catalog"); 
        for (int i = 0; i < bookList.size(); i++)   {
            if (bookList.get(i).isBorrowed() == false)
                System.out.println('"' + bookList.get(i).title + '"');
        } //end of for loop
    } //end of method printAvaliableBooks
   

//} //end of class Library

    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);
                
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

/**********************************************************************
/*  NOTE: I added Gone with the Wind as a test case for me.
/*
/**********************************************************************/

        firstLibrary.addBook(new Book("The DeVinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("Gone with the Wind"));

        System.out.println("Library addresses:");
        System.out.println(firstLibrary.address);
        System.out.println(secondLibrary.address);
        System.out.println();

        System.out.println("Library hours:");        
        firstLibrary.printOpenHours();
        System.out.println(); 

        System.out.println("Books available in the first library:");
        firstLibrary.printAvaliableBooks();         //need to call method via firstLibrary

        System.out.print("Enter the book you wish to borrow: ");
        String input = userInput.nextLine();

        firstLibrary.borrowAvaliableBook(input);
        System.out.println("********");
        System.out.println("Books available in the first library:");
        firstLibrary.printAvaliableBooks();         //need to call method via firstLibrary
        System.out.println();
        System.out.println("Returning  book");
        System.out.println("********");
        firstLibrary.returnBook(input);



                
        System.out.println("Books available in the first library:");
        firstLibrary.printAvaliableBooks();         //need to call method via firstLibrary
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvaliableBooks();        //need to call method via secondLibrary
        System.out.println();
    } //end of main
} //end of class Library    
