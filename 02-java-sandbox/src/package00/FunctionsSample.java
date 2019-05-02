package package00;

import java.util.function.Function;

public class FunctionsSample {

  public static void main(String[] args) {
    // <type of param, type of return>
    Function<String, String> concat42 = txt -> txt+"42";
    Function<Integer, Integer> add42 = value -> value + 42;

    System.out.println(
      concat42.apply("45")
    );

    System.out.println(
      add42.apply(45)
    );

  }

}
