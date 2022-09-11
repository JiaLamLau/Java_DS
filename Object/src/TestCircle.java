public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("这半圆：" + circle1.radius + "是" + circle1.getArea());
        Circle circle2 = new Circle(25);
        System.out.println("这半圆：" + circle2.radius + "是" + circle2.getArea());
        Circle circle3 = new Circle(125);
        System.out.println("这半圆：" + circle3.radius + "是" + circle3.getArea());
    }

}

