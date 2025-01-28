package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try(FileReader reader=new FileReader("java.txt")){
            int read=0;
            do {
                read=reader.read();

                System.out.print((char) read);
            }
            while (read!=-1);

        }catch (IOException exception){
            System.out.println(exception.toString());

        }
    }
}
