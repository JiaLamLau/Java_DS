public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A Circle is :"+circle.toString());
        System.out.println("Color is :"+circle.getColor());
        System.out.println("半径是："+circle.getRadius());
        System.out.println("面积是："+circle.getArea());
        System.out.println("周长是："+circle.getDiameter());
        System.out.println("******************************");
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("面积是："+rectangle.getArea());
    }
}
