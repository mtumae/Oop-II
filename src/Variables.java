public class Variables {

    void showInterest(){
    double amount = 1200.00;
    double interest=3;

    System.out.println("Current amount: "+amount);
    System.out.println("Current interest: "+interest);


    for(int i=1;i<3;i++){
        amount = amount*(100+interest)/100;
        System.out.println("Amount after a year "+i+": "+amount);
    }


    }

    public static void main(String[] args){
        Variables var = new Variables();
        var.showInterest();
    }
}
