class Main {
  
  public static void main(String[] args) {
    numChips(100);
  }
//100 is the number of chips in a pringles can 
  public static void numChips(int n) {
    if (n == 0){
       System.out.println("Done");
    }else{
      System.out.println(n);
      n--;
      numChips(n);
    }
  }
}


