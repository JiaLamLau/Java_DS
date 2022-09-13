import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] array={"red","blue","green"};
        ArrayList<String> list =new ArrayList<>(Arrays.asList(array));
        for(String obj:list){
            System.out.println(obj);
        }
    }
}
