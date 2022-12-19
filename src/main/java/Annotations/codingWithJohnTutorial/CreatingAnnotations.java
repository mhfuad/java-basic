package Annotations.codingWithJohnTutorial;

import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) {
        Cat myCat = new Cat("Stella");
        //Dog myDog = new Dog("Bush");
        if(myCat.getClass().isAnnotationPresent(VeryImportent.class)){
            System.out.println("This is very important");
        }else{
            System.out.println("This thins is not very important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(Runimmediately.class)){
                //method.invoke(myCat);
            }
        }
    }
}
