package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName="java.txt";
        try( FileWriter writer=new FileWriter(fileName)) {
            for (int i=1;i<=100;i++){
                writer.write(i+": I am learning java\n");

            }
            writer.flush();
            System.out.println("file written successfully");

        }catch (IOException exception){
            System.out.println(exception.toString());
        }
    }
}
