import javax.swing.*;

public class ComputeTaxWithSelectionStatement    {
    public static void main(String args[])    {
        //prompt the user to enter filing status
        String statusString = JOptionPane.showInputDialog(null,
            "Enter the filing status:\n" + 
            "0-single tax filer\n1-married filing jointly,\n" +
            "2-married filing separaretly\n3-head of household\n",
            "I am here in the first box header", JOptionPane.QUESTION_MESSAGE);
        int status = Integer.parseInt(statusString);
        
        //Prompt the user to enter taxable income
        String incomeString = JOptionPane.showInputDialog(null,
            "Enter the taxable income:",
            "Box 2 for income input", JOptionPane.QUESTION_MESSAGE);
        double income = Double.parseDouble(incomeString);
        System.out.println(income); 
            
        // Compute tax
        double tax = 0;
       
       if (status == 0)   {   //compute tax for single filers
		   if (income <= 6000)
		          //I WANT TO UNDERSTAND THE MATH HERE!!!!!!!!
		          //TOO MANY "ELSE" S, TOO FEW "IF"S DON'T KNOW WHAT THE PROBLEM HERE !!!!!!!~!!!!!
		       tax = income * 0.10;
		   else if (income <= 27950)  
		       tax = 6000 * 0.10 + (income - 6000) * 0.15;
//		       System.out.println(tax);}
		       
		        else if (income <= 67700)   //****
		             tax = 6000 * 0.10 + (27950 - 6000) * 0.15 +
		             (income - 27950) * 0.27;
		           
		        else if (income <= 141250)
		             tax = 6000 * 0.10 + (27950 - 6000) * 0.15 +
		             (67700 - 27950) * 0.27 + (income - 67700) * 0.30;
		           
		        else if (income <= 307050)
		             tax = 6000 * 0.10 + (27950 - 6000) * 0.15 +
		             (67700- 27950) * 0.27 + (141250 - 67700) * 0.30 +
		             (income - 141250) * 0.35;
		           
		        else 
		             tax = 6000* 0.10 + (27950 - 6000) * 0.15 +
		             (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 +
		             (307050 - 141250) * 0.35 + (income - 307050) * 0.386;
	       //I WANT TO UNDERSTAND THE MATH HERE!!!!!!!!
	     }
	    else if (status == 1)    { //compute tax for married filing jointly
		    if (income <= 12000)    
		   tax = income * 0.10;  
		   //System.out.println (tax + " Fuck off!!");}
		    else if (income <= 46700)    
		       tax = 12000 * 0.10 + (income - 12000) * 0.15;
		         
		         else if (income <= 112850)
		       tax = (12000 * 0.10) + (46700- 12000) * 0.15 +
		             (income - 46700) * 0.27;
		            
		              else if (income <= 171950)
		       tax = (12000 * 0.10) + (46700 - 12000) * 0.15 +
		             (112851 - 46701) * 0.27 + (income  - 112851) * 0.31;
		           
		                   else if (income <= 307050)
		       tax = (12000 * 0.10) + (46700 -12000) * 0.15 +
		             (112851 - 46701) * 0.27 + (171951 - 112851) * 0.30 +
		             (income - 171951) * 0.35;
		           
		                        else 
		       tax = (12000 * 0.10) + (46700 -12000) * 0.15 +
		             (112851 - 46701) * 0.27 + (171951 - 112851) * 0.30 +
		             (307050 - 171951) * 0.35 + (income - 307050) * 0.386;
	         }
	
	    //This really is not what they are looking for because I have the computer evaluate status even after
	    // I have claculated the tax ealier. The program should end AFTER I calculate the tax but in this case
	    // it's not. It will go on and evaluate status again.


	    //This wasn't working before because I left the "else off below preceding the "if" statement. I only had the "if" statement!!!
	    else if (status == 2)    {    //compute tax for married filed separately
		if (income <= 6000) 
		   tax = income * 0.10;
		   else if (income <= 23350)
		       tax = (6000 * 0.10) + (income - 6000) * 0.15;
			else if (income <= 56425)
		       tax = (6000 * 0.10) + (23351 - 6000) * 0.15 +
		             (income - 23351) * 0.27;
			    else if (income <= 85975)
		       tax = (6000 * 0.10) + (23351 - 6000) * 0.15 +
		             (56425 - 23351) * 0.27 + (income - 56426) * 0.30;
				else if (income <= 153525)
		       tax = (6000 * 0.10) + (23350 - 6000) * 0.15 +
		             (56425 - 23351) * 0.27 + (85975 - 56426) * 0.30 +
		             (income - 85976) * 0.35;
		 else 
		       tax = (6000 * 0.10) + (23350 - 6000) * 0.15 +
		             (56425 - 23351) * 0.27 + (85975 - 56426) * 0.30 +
		             (153525 - 85976) * 0.35 + (income - 153526) * 0.386; 
	    //else System.out.println("This is inside status == 2");
	    }
	    else if (status == 3)    {
	        JOptionPane.showMessageDialog(null, "This is in Status = 3",
		 "Status is 3", JOptionPane.INFORMATION_MESSAGE);
		 }            
	    else    {
	        //System.out.println("Invalid input");
		JOptionPane.showMessageDialog(null, "Invalid status input FUCKHEAD!!!",
		"Invalid input", JOptionPane.INFORMATION_MESSAGE); 
		}
		
	   
	   //display the result
	   JOptionPane.showMessageDialog(null, "Tax is " +
	   (int)(tax * 100) / 100.0,
	   "This is the final box!!", JOptionPane.INFORMATION_MESSAGE);
	   
 
    }
    }
 
