class StaticExample8 {
    private static String static_string = "";
    private String instance_string;
    public StaticExample8 (String addToStaticString, String instance_string){
        StaticExample8.static_string += addToStaticString;
        this.instance_string = instance_string;
    }

    public static String getStatic_string() {
        return static_string;
    }

    public static void setStatic_string(String static_string) {
        StaticExample8.static_string = static_string;
    }

    @Override
    public String toString() {
        return "StaticExample8{" +
                "instance_string='" + instance_string + '\'' +
                '}';
    }
}

class Exercise8 {
    public static void main(String[] args) {
        StaticExample8 example1 = new StaticExample8("_1_", "A");
        StaticExample8 example2 = new StaticExample8("_2_", "B");
        StaticExample8 example3 = new StaticExample8("_3_", "C");

        System.out.println(StaticExample8.getStatic_string());
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }
}
