/** This application program displays "Welcome to Java!   :-)"
  * in a message dialog box.
  */
  import javax.swing.JOptionPane;

  public class WelcomeInBox {
    public static void main(String[] args) {
      //Display Welcome to Java!   :-) in a message dialog box
      JOptionPane.showMessageDialog(null, "Welcome to Java!  :-)",
        "I'm ALIVE!!. Help Me", JOptionPane.QUESTION_MESSAGE);
    }
  }
