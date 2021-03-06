import java.util.ArrayList;
public class recursion{
  //LOW BATTERY, GONNA CONTINUE ON MORNING 2/1/19
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n == 0.0){//can't divide anything by 0 when using Newton's approximation;
        return 0.0;
      }
      return sqrtHelp(n, 1, tolerance);
    }

    public static double sqrtHelp(double n, double guess, double tolerance){
      //if/base case: when guess is within 0.0001%
      //else: recall sqrtHelp(n, new guess value);
      if (Math.abs(((Math.pow(guess,2) - n)/n * 100)) <= tolerance){//see if guess is within 0.001% error
        return guess;
      }
      else{
        return sqrtHelp(n, (n/guess + guess)/2, tolerance); // else try  new guess
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      //if/base case: when n = 0||1, return 1;
      //else: recall function fib(n-1) + fib(n-2)
      if (n == 0){
        return 0;
      }
      else if (n == 1){
        return 1;
      }
      else{
        return fib(n-1) + fib(n-2);
      }
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> ans = new ArrayList<Integer>();
      SumHelp(n, 0, ans);
      return ans;
    }

    public static void SumHelp(int start, int answer, ArrayList<Integer> ans){
      //8 answers, try printing to check
      if (start == 0){
        ans.add(answer);
      }
      else{
        SumHelp(start-1, answer+start, ans);
        SumHelp(start-1, answer+0, ans);
      }
    }

}
