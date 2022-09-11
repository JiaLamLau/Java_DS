public class BinarySearch {
    public static void main(String[] args) {
        int[] list ={2,3,4,5,6,7,8,9,90,12,21};
        int j = binarySearch(list,4);
        System.out.println(j);
    }
    public static int binarySearch(int[] list,int key){
        int low =0;
        int high=list.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(key<list[mid])
                high=mid-1;
            else if(key==list[mid])
                return mid;
            else
                low=mid+1;
        }
        return -low-1;
    }
}
