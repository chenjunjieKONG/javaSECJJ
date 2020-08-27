package homework.day08.test4;

public class C extends B {
    int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中numa：" + numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中numb：" + numb);
    }

    public void showC() {
        System.out.println("C类中numc：" + numc);
    }
}
