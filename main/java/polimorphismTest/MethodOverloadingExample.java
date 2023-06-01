package polimorphismTest;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MethodOverloadingExample test = new MethodOverloadingExample();
        test.print(4,5);

    }

    public void print(){
        System.out.println("Nothin");
    }

    public void print(int x){
        System.out.println(x);
    }

    public void print(int x, int y){
        System.out.printf("%d %d",x,y);
    }

}
