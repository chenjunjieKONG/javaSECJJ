package day10.test5;

public class Test {
    public static void main(String[] args) {
        Weapon weapon=new Weapon();
        weapon.setName("无尽之刃");

        Role role=new Role();
        role.setId(1);
        role.setRoleName("凯");
        role.setWeapon(weapon);
        System.out.println(role.getRoleName()+role.getWeapon().getName());
    }
}
