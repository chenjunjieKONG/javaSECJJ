package homework.day10.test5;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("选择：法力角色");
        FightAble fightAble = player.select("法力角色");
        fightAble.commonFight();
        System.out.println("===============");
        Player player1 = new Player();
        System.out.println("选择：武力角色");
        FightAble fightAble1 = player1.select("武力角色");
        fightAble1.commonFight();
    }
}
