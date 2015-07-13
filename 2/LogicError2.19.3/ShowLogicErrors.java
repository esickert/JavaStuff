public class ShowLogicErrors  {
  //careful here when setting up the main class
  public static void main(String[] args) {
    //add two numbers
    int number1 = '3';
    int number2 = '2';
    System.out.println(number1);
    System.out.println(number2);
    number2 += number1 + number2;
    System.out.println("number2 is " + number2);
} }  
