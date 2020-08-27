package homework.day04;

public class Test7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int[] array={1,2,3,4,3,2,1};
        boolean flag=true;
        if(arr.length==array.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=array[i]){
                    flag=false;
                }
            }
        }else {
            flag=false;
        }
        getArr(arr);
        getArr(array);
        System.out.println("是否一致："+flag);
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
        System.out.println();
    }
}
