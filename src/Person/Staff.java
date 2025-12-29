package Person;

public class Staff extends Person{
    private String school;
    private double salary;

    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    // Getter & setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // upToSalary(int percent): salary + (salary * percent) / 100
    public double upToSalary(int percent){
        salary = salary + (salary * percent) / 100;
        return salary;
    }
}
