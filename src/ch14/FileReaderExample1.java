package ch14;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {
    public static void main(String[] args){
        System.out.println("Default Encoding: "+System.getProperty("file.encoding"));

        FileReader fr = null;
        try{
            fr = new FileReader("test.txt");
            int ch;
            while ((ch= fr.read()) != -1)
                System.out.print((char) ch+ " ");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if( fr != null){
                try{
                    fr.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
