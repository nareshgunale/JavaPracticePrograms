package FIleInputOutput;

import java.io.*;

public class FileMerger {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("FileMerger.txt");
        BufferedReader br = new BufferedReader(new FileReader("abc123.txt"));
        String line = br.readLine();
        while(line!=null){
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("BufferedFile.txt"));
        line = br.readLine();

        while(line!=null){
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();


    }
}
