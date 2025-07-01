package RIDOY.packages_static_singleton.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        System.out.println(single.Greetings());
//        Math
        System.out.println( Singleton.Greetings());;
    }


}
