import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    public String name;
    public String ad_no;
    public int age;

    void username(){
        System.out.println("What is your name: ");
        name = sc.next();
    }

    void admission_number(){
        System.out.println("What is your admission number: ");
        ad_no = sc.next();
    }

    void age(){
        System.out.println("What is your age: ");
        age = sc.nextInt();
    }


    void show_det(){
        System.out.println("The current user is \n"+name+"\n"+ad_no+"\n"+age);
    }

    public static void main(String[] args){
        UserInput user = new UserInput();

        user.username();
        user.admission_number();
        user.age();

        user.show_det();
    }
}
