package homework.day08.test7;

public class Cook extends Staff {
    public Cook() {
    }

    public Cook(String id, String name, double wages) {
        super(id, name, wages);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
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
    public double getWages() {
        return super.getWages();
    }

    @Override
    public void setWages(double wages) {
        super.setWages(wages);
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getId() + ",姓名为："
                + getName() + "工资为："
                + getWages() + "的厨师在工作，炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getId() + ",姓名为："
                + getName() + "工资为："
                + getWages() + "的厨师在吃肉");

    }
}
