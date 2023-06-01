package polimorphismTest;

public class InstanceInitializerBlock {
    int speed;

    InstanceInitializerBlock(){
        System.out.println("Speed is "+ speed);
    }

    {speed = 100;}
    public static void main(String[] args) {
        InstanceInitializerBlock bike1 = new InstanceInitializerBlock();
        InstanceInitializerBlock bike2 = new InstanceInitializerBlock();
    }
}
