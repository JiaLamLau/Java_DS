public class TestPassByValue {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        System.out.println("交换前的num1是" + num1 + "和num2是" + num2);
        swap(num1, num2);
        System.out.println("***************************");
        System.out.println("交换后的num1是" + num1 + "和num2是" + num2);
    }
        public static void swap(int n1,int n2){
            System.out.println("交换的方法");
            System.out.println("交换前，n1是"+n1+"和n2是"+n2);
            int temp =n1;
            n1=n2;
            n2=temp;
            System.out.println("交换后，n1是"+n1+"和n2是"+n2);
        }
    }

