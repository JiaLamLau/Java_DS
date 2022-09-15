import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Double> list =new ArrayList<>();
        list.add(4.4);
        list.add(4.0);
        Double doubleobject =list.get(0);
        double d =list.get(1);
        System.out.println(doubleobject);
        System.out.print(d);
    }
}
