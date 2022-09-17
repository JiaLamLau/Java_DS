import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);
        System.out.println("#############################");
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Atlanta1");
        collection2.add("Dallas1");
        collection2.add("Madison1");
        System.out.println("A list of cities in collection2:");
        System.out.println(collection1);

        ArrayList<String> c1 =(ArrayList<String>)(collection1.clone());
        //c1.retainAll(collection2);
        System.out.println("\n cities in collection1 and collection2:");
        System.out.println(c1);
    }
}
