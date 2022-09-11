import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数：");

        int n = input.nextInt();
        System.out.println(n+"的阶乘："+factorial(n));
    }
    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for(int i=1;i<=n;i++)
          result=result.multiply(new BigInteger(i+" "));
        return result;
    }
}
