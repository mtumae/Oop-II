import java.util.*;

public class Conditionals {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        public int guess;
        public int correct;


        void guessing_game(){

            correct = rand.nextInt(0,100);
            System.out.println(correct);


            System.out.println("Guess a number between 0-100: ");
            guess = sc.nextInt();
            if(guess==correct){
                System.out.println("Correct");
            }else{
                System.out.println("Wrong!");
            }
        }


        public static void main(String[] args){
            Conditionals cond = new Conditionals();
            cond.guessing_game();
        }
}
