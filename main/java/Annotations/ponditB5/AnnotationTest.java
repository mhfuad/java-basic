package Annotations.ponditB5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationTest {
    @BookInfoAnnotation(bookName = "Book", author = "fuad", isBN = "123123123", publisher = "biswas")
    private String springInAction;

    private String s1;
    private int i2;

    private AnnotationTest(String s1, Integer i1){
        this.s1 = s1;
        this.i2 = i1;
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Field field = AnnotationTest.class.getDeclaredField("springInAction");

        AnnotationTest test = AnnotationTest.class.getDeclaredConstructor(String.class, Integer.class).newInstance("ABC", 123);
//        System.out.println(test.s1);
//        System.out.println(test.i2);

        BookInfoAnnotation bookinfo = (BookInfoAnnotation) field.getAnnotations()[0];
//        System.out.println(bookinfo.author());
//        System.out.println(bookinfo.bookName());
//        System.out.println(bookinfo.isBN());
//        System.out.println(bookinfo.publisher());

    }
}
