import java.util.*;

public class ArrayChallenge {
    public static void main(String[] args){
        Random rand = new Random();
        String[] ids = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "A220", "B440"};
        String[] random_ids = new String[5];

        for(int i = 0; i<ids.length; i++){
            //System.out.println(ids[i]);
            String id = ids[i];
            //System.out.println(id.substring(0,1));
            if(id.substring(0, 1).equals("B")){
                System.out.println(id);
            }
        }


        System.out.println("\n RANDOMLY GENERATED ARRAY");
        for(int i=0;i< random_ids.length;i++){
            char prefix = (char)(rand.nextInt(5)+'A');
            int number = rand.nextInt(999)+1;
            String suffix = String.format("%03d", number);
            random_ids[i]=prefix+suffix;
        }
        for(String id : random_ids){
            System.out.println(id);
        }


        System.out.println("\n SORTING ARRAY");
        String[] palletes =  {"B14", "A11", "B12", "A13"};

        Arrays.sort(palletes);
        for(String pallet:palletes){
            System.out.println("--"+pallet);
        }

        System.out.println("\n REVERSED ARRAY");
        List<String> palleteList = Arrays.asList(palletes);
        Collections.reverse(palleteList);
        System.out.println(palleteList);



        System.out.println("\n CLEAR ARRAY");
        System.out.println("Before: "+palletes[0].toLowerCase());

        Arrays.fill(palletes,0,2,null);
        if(palletes[0]!=null){
            System.out.println("Ater: "+palletes[0].toLowerCase());


        }else{
            System.out.println("After: "+null);
        }
        System.out.println("Clearing 2 ... count: "+palletes.length);
        for(String pallet :palletes){
            System.out.println(pallet);
        }




    }



}
