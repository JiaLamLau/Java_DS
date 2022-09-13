public class Demo {
    public static void main(String[] args) {
        String s ="abc<>cba";
        String s1 = filter(s);
        System.out.println(s1);
    }
        public static String filter(String s){
            StringBuilder stringBuilder = new StringBuilder();

            for(int i=0;i<s.length();i++){
                if(Character.isLetterOrDigit(s.charAt(i))){
                    stringBuilder.append(s.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
    }

