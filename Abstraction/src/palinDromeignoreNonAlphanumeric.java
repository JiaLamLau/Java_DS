import java.util.Scanner;

public class palinDromeignoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s=input.nextLine();
        System.out.println("输出的字符串："+s+"是回文串"+isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String s1 = filter(s);
        String s2=reverse(s1);
        return s2.equals(s1);
    }
    public static String filter(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));//过滤非法字符串
            }
        }
        return stringBuilder.toString();
    }
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}
