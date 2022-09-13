public class CastingDemo {
    public static void main(String[] args) {
        Object object1 =new Circle(1);
        Object object2 =new Rectangle(1,1);
        disPlayObject(object1);
        disPlayObject(object2);
    }

    public static void disPlayObject(Object object){
        if(object instanceof Circle){
            System.out.println("圆的面积是："+((Circle)object).getArea());
            System.out.println("圆的周长是："+((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle){
            System.out.println("长方形的面积是："+((Rectangle)object).getArea());
        }
    }
}
