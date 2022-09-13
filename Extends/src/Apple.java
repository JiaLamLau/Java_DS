public class Apple extends Fruit {
    public static void main(String[] args) {
        new Apple();
    }


}

    class Fruit{
     public Fruit(){
         System.out.println("水果的无参数构造方法");
     }
        public Fruit(String name){
            System.out.println("水果的构造方法：");
        }
    }

