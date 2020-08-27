package day11.test;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person("关羽",50);
        Person person2=new Person("关羽",50);

//        System.out.println(1==1);
        System.out.println(person1==person2);
        //这里的equals实际调用的是==
        System.out.println(person1.equals(person2));
        System.out.println(person1==person2);

//        String s1="abc";
//        String s2="abc";
//        String s3=new String("abc");
//        String s4=new String("abc");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s3==s4);
//        //String类重写了equals()方法
//        System.out.println(s3.equals(s4));

        //==基本类型和引用类型
        //equals 实际调用的是==，如果重写了equals，比较的就是内容


//        System.out.println(person);
//        System.out.println(person.toString());


    }
}
