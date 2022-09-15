import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities ={"Savannaah","Boston","Atlanta","Tampa"};
        java.util.Arrays.sort(cities);
        for(String city:cities)
            System.out.println(city+" ");
        System.out.println();
        BigInteger[] hugeNumbers ={new BigInteger("239987673637"),
        new BigInteger("4738748274723"),new BigInteger("47826478378")};
        java.util.Arrays.sort(hugeNumbers);
        for(BigInteger number:hugeNumbers)
            System.out.println(number+" ");
    }
}
