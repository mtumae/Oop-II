package ExceptionHandling;

public class DivBy0withCatch {
    public static void main(String[] args){
        int num1 = 1000;
        int num2 = 0;



        try{
            int ans = num1/num2;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by 0!");
        }finally {
            System.out.println("System continues after handling exception.");
        }
    }
}
