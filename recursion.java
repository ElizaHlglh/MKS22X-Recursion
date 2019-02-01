public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrtHelp(n, 1);
    }

    public static double sqrtHelp(double n, double guess){
      //if/base case: when guess is within 0.0001%
      //else: recall sqrtHelp(n, new guess value);
      if (Math.abs(((Math.pow(guess,2) - n)/n * 100)) <= 0.001){//see if guess is within 0.001% error
        return guess;
      }
      else{
        return sqrtHelp(n, (n/guess + guess)/2); // else try  new guess
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}
