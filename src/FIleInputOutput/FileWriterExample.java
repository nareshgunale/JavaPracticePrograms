package FIleInputOutput;
import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("ABC.txt");
        fw.write(100);
        fw.write("\nWriting into a file\nFileInputOutput\n");
        char[] ch ={'a','b','c','d'};
        fw.write(ch);
        fw.flush();
        fw.close();
        System.out.println("---------------------");
        File f = new File("ABC.txt");
        FileReader fr = new FileReader("ABC.txt");
        char[] ch1 = new char[(int)f.length()];
        fr.read(ch1);
       for(char ch2:ch1){
           System.out.print(ch2);
       }
       FileWriter fw1 = new FileWriter("BufferedFile.txt");
       BufferedWriter bw = new BufferedWriter(fw1);
       bw.write(120);
       bw.newLine();
       char[] char3 ={'C','h','a','r','a','c','t','e','r'};
       bw.write(char3);
       bw.newLine();
       bw.write("Sumit");
       bw.newLine();
       bw.flush();
       bw.close();
        System.out.println("----------------");
        FileReader fr1 = new FileReader("BufferedFile.txt");
        BufferedReader br = new BufferedReader(fr1);
        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
