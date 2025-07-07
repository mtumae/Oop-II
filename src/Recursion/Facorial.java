package Recursion;

public class Facorial {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }


    }

    public static void main(String[] args){
        int num = 5;
        int res = factorial(num);
        System.out.println(num+"! is equal to: "+res);
    }
}
