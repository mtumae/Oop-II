package recursion;

public class Sum{
    public static int sum(int n) {
        if (n == 1) { //Base case
            return 1;
        } else {
            return n + sum(n - 1);//Recursive case
        }
    }
    public static void main(String[] args){
            int result = sum(5);
            System.out.println("Sum:"+ result);
    }
}
