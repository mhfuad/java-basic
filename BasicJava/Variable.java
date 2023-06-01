package BasicJava;

public class Variable {
    public static void main(String[] args) {
        Boolean one = false;

        byte bigByte = 127;
        byte smallByte = -128;

        short smallShort = -32768;
        short bigShort = 32767;

        int smallInt = - 2147483648;
        int bigInt = 2147483647;

        long smallLong = -922337203;
        long bigLong = 922337203;

        float f1 = 234.5f;//default 0.0f

        double d1 = 12.3;

        char letter = 'A';

        System.out.println(one);
        System.out.println(smallByte);
        System.out.println(bigByte);
        System.out.println(smallShort);
        System.out.println(bigShort);
        System.out.println(smallInt);
        System.out.println(bigInt);
        System.out.println(smallLong);
        System.out.println(bigLong);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(letter);
    }
}
