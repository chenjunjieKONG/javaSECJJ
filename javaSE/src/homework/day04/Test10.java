package homework.day04;

public class Test10 {
    public static void main(String[] args) {
        int[] arr={99,100,98,97,96};
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if (min > arr[i]) {
                min=arr[i];
            }
            sum+=arr[i];
        }
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("最终得分："+avg);
    }
}
