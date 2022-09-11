import java.math.BigInteger;

public class BigDecimal {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2999992929292929292");
        BigInteger b =new BigInteger("2");
        BigInteger c = a.multiply(b);
        System.out.println(c);
        System.out.println(a);
    }
}
