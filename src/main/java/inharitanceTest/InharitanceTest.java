package inharitanceTest;

class Parent {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void printA() {
        System.out.println(this.a);
    }

    public void printB() {
        System.out.println(this.b);
    }

    public void printC() {
        System.out.println(this.c);
    }

    public void printD() {
        System.out.println(this.d);
    }

}
class Child extends Parent {
    public void printA(){
        this.a = 11;
        System.out.println(a);
    }

    public void print(){
        System.out.println("supper");
        super.printA();
        super.printB();
        super.printC();
        super.printD();

        System.out.println("this");
        this.printA();
        this.printB();
        this.printC();
        this.printD();

        System.out.println("direct access");
        System.out.println(super.a);
        //System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(super.d);
    }
}

public class InharitanceTest {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("===========c===================");
        obj.print();

        Child c1 = new Child();
        System.out.println("===========c2===================");
        c1.print();

        Child c2 = (Child) new Parent();
        System.out.println("===========c3===================");
        c2.print();
    }
}
