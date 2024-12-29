import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer>grades;
    private int id;

    private void id(){
        id++;
    }

    public Student(String name, String surname, int age, String gender,List<Integer> grades){
        super(name, surname, age, gender);
        id();
        this.grades = new ArrayList<>(grades);
    }
    public double calculateGPA(){
        int sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        double avg = sum / grades.size();

        if(avg>=90){
            return 4.0;
        }
        else if(avg>=80){
            return 3.0;
        }
        else if(avg>=70){
            return 2.0;
        }
        else if(avg>=60){
            return 1.0;
        }
        else{
            return 0.0;
        }

    }
    public void addgrades(List<Integer> grades){
        this.grades.addAll(grades);
    }

    public List<Integer> getGrades() {
        return grades;
    }
    @Override
    public String toString() {
        return "I am a student with id"+id;
    }
}
