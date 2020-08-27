package homework.day06.test8;

public class Book {
    private String title;
    private String isbn;
    private double price;
    public Book(){}
    public Book(String title,String isbn,double price){
        this.title=title;
        this.isbn=isbn;
        this.price=price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
