package homework.day05.test4;

public class Card {
    String decor;
    String numder;

    public Card() {
    }

    public Card(String decor, String num) {
        this.decor = decor;
        this.numder = num;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    public String getDecor() {
        return decor;
    }

    public void setNumder(String numder) {
        this.numder = numder;
    }

    public String getNumder() {
        return numder;
    }

    public void showCard() {
        System.out.println(getDecor() + getNumder());
    }
}
