public class Test {
    public static void main(String[] args) {
        A a =new A(3);
    }
}
class A extends B{
    public A(int t){
        System.out.println("A的构造方法被调用");
    }
}
class B{
    public B(){
        System.out.println("B的构造方法被调用");
    }
}
