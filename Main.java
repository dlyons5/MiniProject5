//activates scanner 
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);

   System.out.println("Welcome");

   System.out.println("This is the game where you guess the amount of pringles in a pringles can ");

   System.out.println("So, what is your guess?");
   int numChips = scan.nextInt();

   numChips(numChips);
   
  }

//there is on average 100 chips in a pringles can
  public static void numChips(int n) {
    if (n == 100){
       System.out.println("correct");
    }else{
      System.out.println("incorrect");
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Try again");
      int numChips = scan.nextInt();
      
      numChips(numChips);
    }
  }
}
  
 
 
 





