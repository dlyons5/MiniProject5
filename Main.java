class Main {
  
  public static void main(String[] args) {
    
    int result = sum(13);
    System.out.println(result);
    numChips(100);
   
  }

//there is on average 100 chips in a pringles can
  public static void numChips(int n) {
    if (n == 100){
       System.out.println("Done");
    }else{
      System.out.println(n);
      n--;
      numChips(n);
    }
}

//
  public static int sum(int num)
  {
    if(num > 0)
    {
      return num + sum(num - 1);
      // 
    }else{
      return 0;
      //
   
   
    }
  }
}



