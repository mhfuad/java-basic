package AnnonymousInnerClassDemo;
interface InterfaceA{
    void method1();
}

interface InterfaceB{
    void method2();
}

public class Main {
    public static void main(String[] args) {
        InterfaceA a1 = new InterfaceA() {
            @Override
            public void method1() {
                System.out.println("a1");
            }
        };

        InterfaceA a2 = () -> {
            System.out.println("from a2");
        };
        a1.method1();
        a2.method1();

    }
}
