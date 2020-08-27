package homework.day19.test9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ABCD");
        PrintStream stream=new PrintStream("d.txt");
        System.setOut(stream);
        System.out.println("ABCD");
        stream.close();
    }
}
