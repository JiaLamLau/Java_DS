import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list =new ArrayList<>();
        list.add(45);
        list.add(45.8);
        list.add(45.09);
        list.add(new BigInteger("123455555"));
        list.add(new BigDecimal("2.098909888"));

        System.out.println("最大啊的数是："+getLargestNumber(list));
    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list==null || list.size()==0)
            return null;

        Number number =list.get(0);
        for(int i=1;i<list.size();i++)
           if(number.doubleValue()<list.get(i).doubleValue())
               number =list.get(i);
        return number;
    }
}
