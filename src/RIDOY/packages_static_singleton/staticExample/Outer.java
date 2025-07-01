package RIDOY.packages_static_singleton.staticExample;

public class Outer {
    class Inner {
        String name;

        public Inner(String name) {
            this.name = name;
        }
    }


    static class Inner2 {
        String name;

        public Inner2(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Outer ou = new Outer();
        Inner in = ou.new Inner("Inner");

        System.out.println(in.name);

        Inner2 in2 = new Inner2("Inner2");
        System.out.println(in2.name);


    }
}
