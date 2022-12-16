package Annotations;

@VeryImportent
public class Cat {
    String name;
    int age;

    public Cat(String name){
        this.name = name;
    }
    @Runimmediately
    public void meow(){
        System.out.println("Meow!");
    }

    void eat(){
        System.out.println("Munch ");
    }
}
