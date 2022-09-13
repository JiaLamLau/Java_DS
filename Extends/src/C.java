  class A {
    public A(){
        System.out.println("A的构造方法");
    }
}
class B extends A{

}
public class C{
    public static void main(String[] args) {
        B b =new B();
    }
}
