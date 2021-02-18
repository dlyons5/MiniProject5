class Main {
  
  public static void main(String[] args) {
    int result = sum(15);
    System.out.println(result);
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


//if I receive 5 as a parameter
  //I want to add 5 + 4 + 3 + 2 + 1
  public static int sum(int num)
  {
    if(num > 0)
    {
      return num + sum(num - 1);
      //5 + 10 = 15 
      //4 + 6 = 10
      //3 + 3 = 6
      //2 + 1 = 3
      //1 + 0 = 1
    }else{
      return 0;
      //with 0 as our parameter, we get zero back
   
   
    }
  }
}



