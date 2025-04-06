package ro.ase.pmj.models.buffwriter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("resources/S06/bwriter.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter writer = new BufferedWriter(osw);
            String test = "Ana are mere";
            writer.write(test);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
