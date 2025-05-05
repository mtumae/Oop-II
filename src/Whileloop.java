public class Whileloop {
    public int x=0;

    void loop(){

        while(x<5){
            System.out.println("-----------\t");
            System.out.println("-\n");
           x=x+1;
        }
    }

    public static void main(String[] args){
        Whileloop wl = new Whileloop();
        wl.loop();
    }
}
