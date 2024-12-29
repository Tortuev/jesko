import java.util.ArrayList;
import java.util.Set;

public class School {
    private String name;
    private ArrayList<Student> students=new ArrayList<>();
    private ArrayList<teacher> teacher =new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addTeacher(teacher teacher) {
        this.teacher.add(teacher);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<teacher> getTeacher() {
        return teacher;
    }
    public School(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        String sr = "School name: " + getName() + "\n";
        sr += "Students: " +"\n";
        for(Student student : students) {
            sr += student + "\n";
        }
        sr += "Teachers: " +"\n";
        for(teacher teacher : teacher) {
            sr += teacher + "\n";
        }
        return sr;

    }


}
