class AutoBoxingExample {
    Character c_object = new Character('c');
    char c = 'c';
    Integer i_object = new Integer(12);
    int i = 12;
    Double d_object = new Double(182.3);
    double d = 182.3;
}

public class Exercise9 {
    public static void main(String[] args) {
        AutoBoxingExample autoBoxingExample = new AutoBoxingExample();
        System.out.println(autoBoxingExample.c);
        System.out.println(autoBoxingExample.c_object);
        System.out.println(autoBoxingExample.i_object);
        System.out.println(autoBoxingExample.i);
        System.out.println(autoBoxingExample.d_object);
        System.out.println(autoBoxingExample.d);
    }
}
