/**
 * Created by Admin on 2017/9/24.
 */

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student("tom",10);
        String name = st.getName();
        int age = st.getAge();
        System.out.println(name+" "+age);
    }

}
