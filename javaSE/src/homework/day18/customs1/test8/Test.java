package homework.day18.customs1.test8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("c:/lnfo.txt");
        Scanner scanner=new Scanner(System.in);
        while (true){
            String str=scanner.nextLine();
            if(str.equals("886")){
                break;
            }
            writer.write(str+"\r\n");
        }
        writer.close();
    }
}
