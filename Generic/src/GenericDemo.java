public class GenericDemo {
    public static void main(String[] args) {
        GenericStack<String> stack1 =new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1.toString());
    }
}
