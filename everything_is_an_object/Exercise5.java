class DataOnly {
  int i;
  double d;
  boolean b;
}

class Exercise5 {
  public static void main(String[] args) {
    DataOnly dataOnly = new DataOnly();
    dataOnly.i = 10;
    dataOnly.d = 20.5;
    dataOnly.b = false;

    System.out.println(dataOnly.i);
    System.out.println(dataOnly.d);
    System.out.println(dataOnly.b);
  }
}