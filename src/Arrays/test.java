package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));//将数组变成字符串
        System.out.println(Arrays.binarySearch(arr,8));//二分查找，返回下标
        System.out.println(Arrays.binarySearch(arr,11));

        int[] arr1 = Arrays.copyOf(arr,2);//拷贝数组
        System.out.println(Arrays.toString(arr1));//若小于原数组，则部分拷贝
        int[] arr2 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr2));//若两数组长度相等，则完全拷贝
        int[] arr3 = Arrays.copyOf(arr,15);
        System.out.println(Arrays.toString(arr3));//若大于，则自动补上默认值

        int arr4[] = Arrays.copyOfRange(arr,0,8);//拷贝数组，包左不包右
        System.out.println(Arrays.toString(arr4));

        int arr5[] = {1,5,2,0,1,8,4,6,100,100,60,60,500,9,320};
        Arrays.sort(arr5);//利用快速排序整理数组
        System.out.println(Arrays.toString(arr5));

        Integer[] arr6 = {9,-9,0,1,5,2,0,1,8,4,6,100,100,60,60,500,9,320};
        Arrays.sort(arr6,new Comparator<Integer>() {                    //public static void sort(数组,排序规则)
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }                                                 //参数一:要排序的数组
        });                                                  //参数二:排序的规则
                                                                                    // 细节:
                                                                                //只能给引用数据类型的数组进行排序
                                                                                //按照指定的规则排序                                                                   //如果数组是基本数据类型的,需要受成其对于的包装类
    }
}
