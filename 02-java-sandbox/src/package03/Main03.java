package package03;

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

  public Power getPower() {
    return power;
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

public class Main03 {
  public static void main(String[] args) {

    Hero bob = new Hero("Bob");
    Hero clark = new Hero("SuperMan", new Power("flying"));

    System.out.println(
      clark.getPower().getName()
    );

    System.out.println(
      bob.getPower().getName()
    );

  }
}
