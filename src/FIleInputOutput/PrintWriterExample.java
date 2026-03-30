package FIleInputOutput;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc123.txt");
//        File f = new File("abc123.txt");
//        System.out.println(f.getAbsolutePath());
        PrintWriter out = new PrintWriter(fw);
        out.write(100);
        out.println(100);
        out.println(true);
        out.println("Sumit");
        out.flush();
        out.close();
    }
}
