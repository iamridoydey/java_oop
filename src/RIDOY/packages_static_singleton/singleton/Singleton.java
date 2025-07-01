package RIDOY.packages_static_singleton.singleton;

public class Singleton {
    private  static Singleton instance;
    private Singleton(){

    }

    public static String Greetings(){
        return "Hello Singleton!";
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
