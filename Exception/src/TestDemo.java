public class TestDemo {
    public static void main(String[] args) {
        new A();
        System.out.println("*************");
        new B();
    }
}
class A{
    int i=7;
    public A(){
        setI(20);

        System.out.println("i来自于A是"+i);

    }

    public void setI(int i){
        this.i=2*i;
    }
}
class B extends A{
    public B(){

        System.out.println("i来自于B是"+i);
    }
    public void setI(int i){
        this.i=3*i;
    }
}