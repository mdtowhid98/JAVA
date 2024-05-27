package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubInput {

    File file = new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");

    public void write() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.append("drftjhinuib ");
        pw.append(" dcvtghbnikjoik");
        pw.append(" rdfgyhuijujl");
        pw.append(" westyiunb");
        pw.close();
    }

    public void read() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
    }
}
