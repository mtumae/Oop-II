package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public void processFile(String file_path){
        FileReader reader =null;
        try{
            reader = new FileReader(file_path);
            BufferedReader buffreader = new BufferedReader(reader);
            String line;
            while((line=buffreader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found! "+e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file! "+e.getMessage());
        }finally{
            if(reader!=null){
                try{
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader! "+e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args){
        FileProcessor file = new FileProcessor();
        file.processFile("./loremipsum.txt");

    }
}
