public class TestTo {
    public static void main(String[] args) {
        String s = "Hi,Good Morning";
        System.out.println(m(s));
    }//统计大写字母的个数
    public static int m(String s){//Hi,Good Morning
        int count =0;
        for(int i=0;i<s.length();i++)
            if(Character.isUpperCase((s.charAt(i))))//判断是否为大写字母
            count++;
        return count;
    }
}
