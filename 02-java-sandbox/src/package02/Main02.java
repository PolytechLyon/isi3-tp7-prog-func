package package02;

import functional.Monad;

import java.util.function.Function;

public class Main02 {
  public static void main(String[] args) {

    Function<String, Monad<String>> addCherryMonad = content -> new Monad<String>(content+" Cherry");
    Function<String, Monad<String>> addAppleMonad = content -> new Monad<String>(content+" Apple");
    Function<String, Monad<String>> addPearMonad = content -> new Monad<String>(content+" Pear");

    Monad<String> bottle = new Monad<String>("Pear");

    System.out.println(
      bottle
        .flatMap(addCherryMonad)
        .flatMap(addAppleMonad)
        .flatMap(addPearMonad)
        .getValue()
    );
    // result: Pear Cherry Apple Pear


  }
}
