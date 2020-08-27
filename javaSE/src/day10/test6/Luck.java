package day10.test6;

import java.util.ArrayList;
import java.util.Random;

public class Luck implements RedPacket{
    @Override
    public ArrayList<Integer> faHongBao(int money, int count) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        int num=count;
        for (int i = 0; i < count-1; i++) {
            int sum=random.nextInt(money/num*2)+1;
            list.add(sum);
            money-=sum;
            num--;
        }
        list.add(money);
        return list;
    }
}
