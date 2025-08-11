package UML;

class Teacher {
    private final String name;

    public Teacher(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void teach(Student student){
        System.out.println(name + " is teaching " + student.getName());
    }
}

class Student {
    private final String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Saikat Mandal");
        Student student = new Student("Rahul");

        teacher.teach(student);
    }
}
