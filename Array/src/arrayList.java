import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        int[] list={2,3,4,5,6,4,3,3,11,98};
        System.out.println("查找的是："+ Arrays.binarySearch(list,11));
        char[] chars={'a','e','t','p','y'};
        System.out.println("查找的是："+Arrays.binarySearch(chars,'t'));
    }
}
