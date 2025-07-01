package RIDOY.packages_static_singleton.staticExample;

public class StaticBlock {
    // Instance variable
    static int a = 3;
    static int b;

    static{
        System.out.println("Static block run");
        // Initialize b
        b = a * 9;
    }

    public static void main(String[] args) {
        StaticBlock st = new StaticBlock();

        System.out.println(StaticBlock.a + " "  + StaticBlock.b);

        StaticBlock.b += 9;

        System.out.println(StaticBlock.a + " "  + StaticBlock.b);
    }
}
