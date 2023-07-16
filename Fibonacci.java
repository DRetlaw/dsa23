class Fibonacci {

  public static void main(String [] s){
    System.out.println("done");
    int n = 21;
    System.out.println(getFibonnaci(n));
  }

  static int getFibonnaci(int n){
    if(n<2)
      return n;
    
    return getFibonnaci(n-1)+getFibonnaci(n-2);
    
  }

}
