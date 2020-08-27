package homework.day04;

public class Test8 {
    public static void main(String[] args) {
        String [] arr1={"D","C","B","A","D"};
        String [] arr2={"A","D","B","C","D"};
        String [] arr3={"A","D","B","C","A"};
        String [] arr4={"A","B","C","D","D"};
        System.out.println("满分10分，小明：得分："+getNum(arr1)+"分");
        System.out.println("满分10分，小红：得分："+getNum(arr2)+"分");
        System.out.println("满分10分，小黄：得分："+getNum(arr3)+"分");
        System.out.println("满分10分，小强：得分："+getNum(arr4)+"分");

    }
    public static int getNum(String[] arr){
        int num=0;
        String [] array={"A","D","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==array[i]){
                num+=2;
            }
        }
        return num;
    }
}
