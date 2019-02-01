public class driver{
  public static void main(String[] args){
    System.out.println("Testing sqrt(n, tolerance):");
    System.out.println("sqrt(2), Expecting: 1.4142.   Getting: " + recursion.sqrt(2,0.001));
    System.out.println();
    System.out.println("Testing fib(n):");
    System.out.println("fib(5), Expecting: 8.   Getting: " + recursion.fib(5));
    System.out.println();
    System.out.println("Testing makeAllSums(n):");
    System.out.println("Sum(3), Expecting: [0, 3, 2, 5, 1, 4, 3, 6].   Getting: " + recursion.makeAllSums(3));

  }
}
