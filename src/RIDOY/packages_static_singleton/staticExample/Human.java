package RIDOY.packages_static_singleton.staticExample;

public class Human {
    static long population;
    String name;
    int age;
    int salary;
    boolean isMarried;

    public Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }


}
