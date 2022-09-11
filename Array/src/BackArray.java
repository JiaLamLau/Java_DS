public class BackArray {
    public static void main(String[] args) {
        //reverse(new array[]{1,4,5,6,7});
        int[] list1={1,3,4,5,6,7};
        int[] list2=reverse(list1);
        for (int a:list2) {
            System.out.print(a);//foreach循环
        }
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i=0,j=result.length-1;i< list.length;i++,j--){
            result[j] = list[i];
        }
        return result;//返回一个数组
    }
}
