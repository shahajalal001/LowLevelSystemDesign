package UML;

import java.util.Arrays;
import java.util.List;

class Professor {
    private final String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }
}

class Department {
    private final String name;
    private final List<Professor> professors;

    public Department(String name, List<Professor> professors){
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors(){
        System.out.println("Department: " + name);
        for(Professor prof: professors){
            System.out.println(prof.getName());
        }
    }

}

public class AggregationExample {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Injamam");
        Professor prof2 = new Professor("Saikat Mandal");

        List<Professor> professors = Arrays.asList(prof1, prof2);
        Department department = new Department("CSE", professors);

        department.showProfessors();
        
    }
    
}
