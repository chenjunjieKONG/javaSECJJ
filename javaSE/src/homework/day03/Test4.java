package homework.day03;

public class Test4 {
    public static void main(String[] args) {
        char aChar = getChar(65);
        System.out.println("字符：" + aChar);
    }
    public static char getChar(int num) {
        char ch = (char) num;
        if (ch < 'a' || ch > 'z') {
            ch = (char) num;
        } else if (ch < 'A' || ch > 'z') {
            ch = (char) num;
        } else if (ch < '0' || ch > '9') {
            ch = (char) num;
        } else {
            ch = ' ';
        }
        return ch;
    }
}
