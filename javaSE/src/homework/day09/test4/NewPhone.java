package homework.day09.test4;

public class NewPhone extends OldPhone implements Play {
    public NewPhone(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    @Override
    public void PlayGame() {
        System.out.println(getName() + "玩游戏");
    }
}
