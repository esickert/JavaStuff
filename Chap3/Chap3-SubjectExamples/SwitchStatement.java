public class SwitchStatement    {
    public static void main(String args[])    {
    
    int month = 9;
    String monthString;
    
    if (month > 5)
        System.out.println("The number is too fucking high DICKHEAD!!!");
    else {
	System.out.println("Okay the number will work!");
    }
    
    System.out.println((month > 5) ? "The number is too fucking high DICKHEAD!!!" : "Okay the number will work!");
    
    switch (month) {
        case 1: System.out.print (monthString = "January");
				break;
        case 2: System.out.println (monthString = "February");
				break;
	case 3: System.out.println (monthString = "March");
				break;
        case 4: System.out.println (monthString = "April");
				break;
        case 5: System.out.println (monthString = "May");
				break;
	default: System.out.println (monthString = "Wrong input fuckface!!");
	}
}
}
