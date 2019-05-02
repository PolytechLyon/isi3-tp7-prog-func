package package01;

import functional.Monad;

import java.util.function.Function;



public class Main {
  public static void main(String[] args) {

    Function<String, String> bold = txt -> "<b>"+txt+"</b>";
    Function<String, String> italic = txt -> "<i>"+txt+"</i>";
    Function<String, String> h1 = txt -> "<h1>"+txt+"</h1>";

    Monad html = new Monad<String>("Hello World");

    System.out.println(
      html.map(bold).map(italic).map(h1).getValue()
    );

    // result <h1><i><b>Hello World</b></i></h1>

    System.out.println(
      html
        .map(txt -> "<b>"+txt+"</b>")
        .map(txt -> "<i>"+txt+"</i>")
        .map( txt -> "<h1>"+txt+"</h1>")
        .getValue()
    );

    // result <h1><i><b>Hello World</b></i></h1>





  }
}
