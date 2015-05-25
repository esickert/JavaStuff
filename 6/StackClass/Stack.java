public class Stack  {
    
//    private int[] elements;
    private char[] characters;
    private int size;

    /** construct a stack with default capacity 20  */
    /** note the "this" statement !!!               */
    public Stack()  {
        this(20);
    } // end of constructor

    /** costruct a stack with specified capacity  */
    public Stack(int capacity)  {
//        elements = new int[capacity];
        characters = new char[capacity];
    } //end of constructor
    /******************************************************************/
    /** push a new integer into the top of the stack  */
    public char push(char value)  {
        if (size >= characters.length)    {
            char[] temp = new char[characters.length * 2];
            System.arraycopy(characters, 0, temp, 0, characters.length);  //this is something new!!! System.arraycopy()
            characters = temp;
        }
        return characters[size++] = value;
    } //end of push

    /******************************************************************/

    /** return and remove the top element from the stack */
    public char pop()    {
        return characters[--size];
    } //end of pop
    /******************************************************************/

    /** return the top element of the stack */
    public char peek()   {
        return characters[size -1];
    } //end of peek
    /******************************************************************/

    /** test wether the stack is empty */
    public boolean empty()  {
        return size == 0;
    } //end of empty
    /******************************************************************/

    /** return the number of elements in the stack  */
    public int getSize()   {
        return size;
    } // end of getSize
    /******************************************************************/

    public String convertArrayToString()   {
        String newString = new String(characters);
        return newString;
       
    }
    
}


