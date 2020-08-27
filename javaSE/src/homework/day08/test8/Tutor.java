package homework.day08.test8;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的助教 "+getName()+" 在帮助老师解决问题");

    }
}
