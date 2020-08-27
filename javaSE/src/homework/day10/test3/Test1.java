package homework.day10.test3;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(new User(null,i));
        }
        System.out.println("未分组");
        System.out.print("[");
        for (User u:list) {
            System.out.print(u.getId()+"-"+u.getType());
            if (list.indexOf(u) == list.size() - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }
        Reception reception1=new Reception(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("v1");
            }
        });
        Reception reception2=new Reception(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("v2");
            }
        });
        Reception reception3=new Reception(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("A");
            }
        });
        reception1.typeUser(list,10,19);
        reception2.typeUser(list,20,29);
        reception3.typeUser(list);
        System.out.println("已分组：");
        for (User u : list) {
            if (u.getId() % 9 == 1) {
                System.out.println();
            }
            System.out.print(u.getId() + "-" + u.getType() + " ");
        }
    }
}
