package Assertion;

public class Demo {
    public static void main(String[] args) {
        int a = 0;

        while (true){
            if( a > 1){
                System.out.println("Code correctly executing. Going to Break.");
            }
            //System.out.println("Code Execution should not reach here, Something wrong. A ="+a);
            assert false : "Code Execution should not reach here, Something wrong. A ="+a;
            break;
        }
    }
}
