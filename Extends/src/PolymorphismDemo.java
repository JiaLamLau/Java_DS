public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1,"red",false));
        displayObject(new Rectangle(1,1,"black",true));
    }
    public static void displayObject(GeometricObject object){
        System.out.println("创立"+object.getDateCreated()+"颜色"+object.getColor());
    }
}
