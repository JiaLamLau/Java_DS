public class Test2 {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();//相当于调用三次
        //T t2 = new T();
        System.out.println("t1的i=" + t1.i+"和j="+t1.j);
        System.out.println("t2的i=" + t2.i+"和j="+t2.j);
        System.out.println("t3的i=" + t3.i+"和j="+t3.j);

    }


}
