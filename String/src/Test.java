public class Test {
    public static void main(String[] args) {
        String newString = new String("stringLiteral");
        System.out.println(newString.replace('i','A'));//所有的i被A替换
        System.out.println(newString.replaceFirst("i","AB"));

    }
}
