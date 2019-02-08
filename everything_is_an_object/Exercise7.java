
class Incrementable {
  static int i;
  static void increment() {
    i++;
  }
}

class Exercise7 {
  public static void main(String[] args) {
    System.out.println("before increment");
    System.out.println(Incrementable.i);
    System.out.println("after increment");
    Incrementable.increment();
    System.out.println(Incrementable.i);

  }
}