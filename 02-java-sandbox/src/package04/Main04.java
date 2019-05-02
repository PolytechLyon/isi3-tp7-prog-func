package package04;

import java.util.Optional;

class Power {
  private String name;
  public String getName() {
    return name;
  }

  Power(String name) {
    this.name = name;
  }
}

class Hero {
  private String name;
  private Power power;

  public Optional<Power> getPower() {
    return  Optional.ofNullable(power);
  }

  public String getName() {
    return name;
  }


  Hero(String name) {
    this.name = name;
  }

  Hero(String name, Power power) {
    this.name = name;
    this.power = power;
  }

}

public class Main04 {
  public static void main(String[] args) {


    Hero bob = new Hero("Bob");
    Hero clark = new Hero("SuperMan", new Power("flying"));

    System.out.println(
      clark.getPower().orElse(new Power("nothing")).getName()
    );

    System.out.println(
      bob.getPower().orElse(new Power("nothing")).getName()
    );

    System.out.println(
      clark.getPower()
        .map(v -> new Power("x-ray-vision"))
        .orElse(new Power("nothing"))
        .getName()
    );

  }
}
