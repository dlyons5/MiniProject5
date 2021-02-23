//activates scanner 
import java.util.Scanner;

class Main {
  //this is the main method, everting will pass through this method 
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
   //this is the scanner
   System.out.println("Welcome");
   //welcoming the user 
   System.out.println("This is the game where you guess the amount of pringles in a pringles can ");
   //intoducing the game
   System.out.println("So, what is your guess?");
   int chips = scan.nextInt();
   //asking the user for their input
   numChips(chips);
   //this above executes the other method below 
   
  }

  //there is on average 100 chips in a pringles can
  public static boolean numChips(int chips) {
    if (chips == 100){
    //the correct answer is 100, so if they guess 100, then it will print "Correct..."  
       System.out.println("Correct!! :), there are 100 chips on average in a pringles can");
       return true;
       //this above stops the else statement if the user answers correct 
    
    }else{
    //if the answer the user guess is not 100,than it will go to the else statement that will pirnt out "incorrect"  
      System.out.println("Incorrect :(");
      //have to make another scanner because it can't read the one from the main method, it will just spit out an error ---> 
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Try again");
      chips = scan.nextInt();
      //prints out try again, and the scanner askes the user for another input
      return numChips(chips);
    }
  }
}
  
 
 
 





