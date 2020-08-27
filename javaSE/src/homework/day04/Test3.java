package homework.day04;

public class Test3 {
    public static void main(String[] args) {
        int[] nums={5,10,15};
        int[] newArr=new int[nums.length];
        System.out.println("nums数组：");
        for (int i = 0; i < nums.length; i++) {
            newArr[i]=nums[i]*2;
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("newArr数组：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
