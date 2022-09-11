public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Data System");
        course1.addStudent("Piter");
        course1.addStudent("Jason");
        course1.addStudent("Kim");

        course2.addStudent("Rose");
        course2.addStudent("Loy");
        System.out.println("course1的学生人数"+course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i=0;i<course1.getNumberOfStudents();i++)
            System.out.println(students[i]);
        System.out.println();

        System.out.println("course2的学生人数："+course2.getNumberOfStudents());

    }
}
