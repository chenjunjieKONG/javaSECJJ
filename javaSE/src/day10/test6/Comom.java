package day10.test6;

import java.util.ArrayList;

public class Comom implements RedPacket{
    @Override
    public ArrayList<Integer> faHongBao(int money, int count) {
        ArrayList<Integer>  list=new ArrayList<>();
        int avg=money/count;
        for (int i = 0; i < count; i++) {
                list.add(avg);
                money-=avg;
        }
        list.add(money);
        return list;
    }
}
