package ro.ase.pmj.models.scanner;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Intodu text: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println(buffer);

        try {
            FileOutputStream fos = new FileOutputStream("scanner.txt");
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
