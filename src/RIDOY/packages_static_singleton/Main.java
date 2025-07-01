package RIDOY.packages_static_singleton;

public class Main {
    public static void main(String[] args){
        A a = new A("aaa");
        System.out.println(a);
        System.out.println(Integer.toHexString(a.hashCode()));
        System.out.println();

    }
}


class A{
    String name;
    A(){

    }

    A(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}