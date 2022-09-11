public class clone {
    public static void main(String[] args) {
        int [] sourceArray={2,3,4,5,6};
        int [] targetArray=new int[sourceArray.length];
        for(int i=0;i<sourceArray.length;i++){
            targetArray[i] = sourceArray[i];
            System.out.print(" "+targetArray[i]);
        }

    }
}
