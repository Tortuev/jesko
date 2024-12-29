import javax.security.auth.Subject;

public class teacher extends Person{
    private String subject;
    private int yearsOfexperience;
    private int salary;

    public teacher(String name,String surmame,int age,String gender,String subject, int experience, int salary) {
        super(name,surmame,age,gender);
        this.subject = subject;
        this.yearsOfexperience = experience;
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getYearsOfexperience() {
        return yearsOfexperience;
    }
    public void setYearsOfexperience(int yearsOfexperience) {
        this.yearsOfexperience = yearsOfexperience;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void giveRaise(int age,double percentage) {
        if(this.yearsOfexperience > 10) {
            this.salary +=this.salary* (age*percentage);
        }
    }
    public String israised(int age) {
        if(this.yearsOfexperience > age ) {
            return "Salary was raised for: ";
        }
        return "Salary still same";
    }
    @Override
    public String toString(){
        return "I teach"+subject;
    }


}
