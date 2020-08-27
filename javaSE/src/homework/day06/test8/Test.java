package homework.day06.test8;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请录入第" + i + "本书的名称");
            String name = in.next();
            System.out.println("请录入第" + i + "本书的ISBN编码");
            String number = in.next();
            System.out.println("请录入第" + i + "本书的价格");
            double price = in.nextDouble();
            Book book = new Book(name, number, price);
            list.add(book);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getTitle() + "," + list.get(j).getIsbn() + "," + list.get(j).getPrice());
        }
    }
}
