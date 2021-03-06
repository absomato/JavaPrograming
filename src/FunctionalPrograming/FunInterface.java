package FunctionalPrograming;
import java.util.function.*;
//어떤 import하는거 공부해라 하나씩 써라

@FunctionalInterface
interface Square {
    int calculate(int x);
}

@FunctionalInterface
interface Max {
    boolean isFirst(int x, int y);
}
 
class FunInterface {

  static UnaryOperator<Integer> fac = n -> n == 0    // recursive
		  //Function<Integer,integer>도 할 수 있음
      ? 1
      : n * FunInterface.fac.apply(n-1);        // static method
  
  public static void main(String args[]) {

      // Unary Functions
      Square square = x -> x*x;
      Function<Integer,Integer> square2 = x -> x*x;
      UnaryOperator<Integer> square3 = x -> x*x;

      System.out.println(square.calculate(5));
      System.out.println(square2.apply(5));
      System.out.println(square3.apply(5));
      System.out.println(fac.apply(5));

      // Binary Functions
      Max isBigger = (x,y) -> x > y;
      BiFunction<Integer,Integer,Boolean> isBigger2 = (x,y) -> x > y;
      BiPredicate <Integer,Integer> isBigger3 = (x,y) -> x > y;

      // lambda definition with multiple statements
      BinaryOperator <Integer> smallerSquare = ((x,y) -> {
          Integer smaller = x > y ? y : x;
          return square2.apply(smaller);
      });

      // Consumer : no return value
      BiConsumer<Integer,Integer> smallerSquare2 = ((x,y) -> {
          Integer smaller = x > y ? y : x;
          System.out.println("BiConsumer : " + square2.apply(smaller));
      });

      System.out.println(isBigger.isFirst(10,20));
      System.out.println(isBigger2.apply(10,20));
      System.out.println(isBigger3.test(10,20));

      System.out.println(smallerSquare.apply(10,20));
      smallerSquare2.accept(10,20);
  }
}