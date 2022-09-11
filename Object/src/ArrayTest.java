public class ArrayTest {
    public static void main(String[] args) {
        Circle[] circleArray = new Circle[10];
        for (int i=0;i<circleArray.length;i++){
            circleArray[i] = new Circle();
            System.out.println(circleArray[i]);
        }
    }
}
