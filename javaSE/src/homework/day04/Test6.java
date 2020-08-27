package homework.day04;

public class Test6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                flag=false;
            }
        }
        getArr(arr);
        System.out.print(" 是否对称:"+flag);
    }
    public static void getArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
