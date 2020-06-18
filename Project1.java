
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*;


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METODS (functions) that relate to each other
public class Project1 {

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {

    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input = new Scanner(System.in);

    // a standard Java method for output of a STRING LITERAL
    // the \n denotes a "carriage return" - or blank line
    System.out.println("-- Project1 --");

    System.out.println("What is your quest?");

    // initialize a STRING VARIABLE and call the Scanner.nextLine() of user_input
    String something = user_input.nextLine();

    if (something.length() <= 10) {
      System.out.println("Interesting...");
      System.out.println("Could you be more specific?");
      something = user_input.nextLine();

      if (something.length() <= 20) {
        System.out.println("Not enough info.");
        System.out.println("Try again?");
        something = user_input.nextLine();

        if (something.length() <= 40) {
          System.out.println("I want a paragraph, you give me nothing.");
          System.out.println("Last try: What is your quest?");
          something = user_input.nextLine();
          System.out.println("I see... but now I must go, sorry. o/");
        } else {
          System.out.println("Noice.");
        }

      } else {
        System.out.println("WOW! So amazing!");
        System.out.println("Why that tho?");
        something = user_input.nextLine();
        
        if (something.length() <=5) {
          System.out.println("Ok then.");
        } else {
          System.out.println("Cool.");
        }
      }

    } else {
      System.out.println("Nice! ");
      System.out.println("Why is that your quest?");
      something = user_input.nextLine();

      if (something.length() <= 10) {
        System.out.println("Hmm.. ok.");
      } else {
        System.out.println("Oh, that's neat.");
        System.out.println("Do you like talking to me?");
        user_input.nextLine();
        System.out.println("Ok, well I actually have to go now, so.. bye!");
        user_input.nextLine();
      }
    }

  }
}
