package ch14;

import java.io.*;

public class DataStreamText {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("sample.dat"))){
            out.writeInt(123);
            out.writeFloat(123.456F);
        }

        try(DataInputStream in = new DataInputStream(new FileInputStream("sample.dat"))){
            int aint = in.readInt();
            float afloat = in.readFloat();

            System.out.println(aint);
            System.out.println(afloat);
        }
    }
}
