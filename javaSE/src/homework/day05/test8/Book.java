package homework.day05.test8;

public class Book {
    String numder;
    String bookName;
    String isbn;
    double price;
    String date;

    public Book() {
    }

    public Book(String numder, String bookName, String isbn,
                double price, String date) {
        this.numder = numder;
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
        this.date = date;
    }

    public void setNumder(String numder) {
        this.numder = numder;
    }

    public String getNumder() {
        return numder;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void showBook() {
        System.out.println("最贵的书是：" + getNumder() + "," + getBookName() + ",isbn" +
                getIsbn() + "," + getPrice() + "," + getDate());
    }
}


