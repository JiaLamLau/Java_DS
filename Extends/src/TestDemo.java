public class TestDemo {
    public static void main(String[] args) {
          new Person().printPerson();
          new Student().printPerson();
    }
}
class Student extends Person{
    public String getInfo(){
        return "Student";
        //System.out.println("Student");
    }
}
class Person{
    private String getInfo(){
        return "Person";
    }
    public void printPerson(){
        System.out.println(getInfo());
    }
}