package RIDOY.packages_static_singleton.staticExample;

public class Main {
    public static void main(String[] args) {
        Human prite = new Human("Prite", 22, 4000, true);
        Human ridoy = new Human("Ridoy", 22, 4000, true);

        System.out.println(ridoy.isMarried);
        System.out.println(prite.isMarried);
        System.out.println(ridoy.population);
        System.out.println(prite.population);

    }

    void firstGreet(){
        greetings();
    }

    void greetings(){
        System.out.println("Hello World!");
    }

}
