package homework.day09.test4;

public class Test1 {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone("旧手机");
        oldPhone.call();
        oldPhone.sendMessage();
        NewPhone newPhone = new NewPhone("新手机");
        newPhone.call();
        newPhone.sendMessage();
        newPhone.PlayGame();
    }
}
