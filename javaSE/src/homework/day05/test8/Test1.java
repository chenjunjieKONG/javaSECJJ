package homework.day05.test8;

public class Test1 {
    public static void main(String[] args) {
        Book book1 = new Book("0003", "javaWeb实战",
                "387648797524", 50.8, "2017-01-01");
        Book book2 = new Book("0004", "前端实战",
                "387648797525", 100.8, "2017-02-01");
        Book book3 = new Book("0005", "java实战",
                "387648797526", 90.8, "2017-03-01");
        Book[] arr = {book1, book2, book3};
        getMax(arr);
    }

    public static void getMax(Book[] arr) {
        Book max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.getPrice() < arr[i].getPrice()) {
                max = arr[i];
            }
        }
        max.showBook();
    }
}
