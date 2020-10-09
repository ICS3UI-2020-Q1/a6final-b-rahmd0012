import java.util.Scanner;
/**
 * A program that determines if 5 numbers from two arrays are the same
 * @author Daniel Rahmani 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array for the first five numbers
    int[] integers = new int[5];

    // ask the user for the first 5 values
    System.out.println("Please enter the values for the first array:");
    // create a for loop to get the 5 values
    for(int i = 0; i < 5; i++){
    integers[i] = input.nextInt();
    }

    // create an array for the second 5 number
    int[] integers2 = new int[5];

    // ask the user to enter 5 more values
    System.out.println("Please enter the values for the second array:");
    // create a for loop to get the second 5 values
    for(int i = 0; i < 5; i++){
    integers2[i] = input.nextInt();
    }

    // create a variable to find the total of the first 5 values
    int total = (integers[0]) + (integers[1]) + (integers[2]) + (integers[3]) + (integers[4]);

    // create a variable to find the total of the second 5 values
    int total2 = (integers2[0]) + (integers2[1]) + (integers2[2]) + (integers2[3]) + (integers2[4]);

    // create an if statement to find out if they're the same or not
    if(total == total2 && integers[0] == integers2[0] && integers[1] == integers2[1] && integers[2] == integers2[2] && integers[3] == integers2[3] && integers[4] == integers2[4]){
      System.out.println("These arrays are the same");
    } else
    System.out.println("These arrays are not the same");

    

    
  }
}
