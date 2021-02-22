//activates scanner 
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);

   System.out.println("Welcome");
   //intoducing the game
   System.out.println("This is the game where you guess the amount of pringles in a pringles can ");
   //asking the user for a guess
   System.out.println("So, what is your guess?");
   int numChips = scan.nextInt();

   numChips(numChips);
   
  }

//there is on average 100 chips in a pringles can
  public static void numChips(int n) {
    if (n == 100){
       
       System.out.println("Correct!! :), there are 100 chips on average in a pringles can");

    }else{
      
      System.out.println("Incorrect :(");
      //have to make another scanner because it can't read the one from the other method, it will just spit out an error ---> 
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Try again");
      int numChips = scan.nextInt();
      
      numChips(numChips);
    }
  }
}
  
 
 
 





