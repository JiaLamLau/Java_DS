public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers ={1,2,3,4,5};
        String[] strings ={"London","Paris","Berlin","New York","Austin"};
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }
    public static <E> void print(E[] list){//泛型的好处
        for(int i=0;i<list.length;i++)
        System.out.println(list[i]+" ");
        System.out.println();
    }
}
