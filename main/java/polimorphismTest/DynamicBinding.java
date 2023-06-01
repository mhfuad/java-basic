package polimorphismTest;
class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}
public class DynamicBinding extends Animal{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}
