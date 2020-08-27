package homework.day10.test5;

public class Player {
    FightAble select(String str){
        if(str=="法力角色"){
           Master master=new Master();
           master.specialFight();
           return master;
        }else {
            Warrior warrior=new Warrior();
            warrior.specialFight();
            return warrior;
        }
    }
}
