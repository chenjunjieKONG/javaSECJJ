package homework.day12.Checkpoint2.test3;

public class Test {
    public static void main(String[] args) {
        //定义一个String数组,调用swap方法,交换指定索引的元素
        String[] strArr = {"a", "b", "c", "d", "e", "f", "g"};
        swap(strArr, 2, 3);
        //定义一个Integer数组,调用swap方法,交换指定索引的元素
        Integer[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(numArr, 4, 5);
    }

    //编写一个泛形方法，数组是任意类型,并传入2个要交换位置的索引
    public static <E> void swap(E[] arr, int index1, int index2) {
        //使用第三方变量的方式交换数组中的元素
        E e = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = e;
        for (E e1 : arr) {
            System.out.print(e1 + " ");
        }
        System.out.println();
    }
}
