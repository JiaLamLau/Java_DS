public class PrintArray {
    public static void main(String[] args) {
        printArray(new int[]{2, 3, 4, 5, 6});//匿名数组
    }
        public static void printArray(int[] array){
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
        }
    }
}
