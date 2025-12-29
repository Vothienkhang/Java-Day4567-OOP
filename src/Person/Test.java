package Person;

public class Test {
    public static void main(String[] args) {
        Student A = new Student("Khang dep zai", "HCM", "Software Engineer", 2025, 10);
        System.out.println("Student Name: " + A.getName());
        System.out.println("Rating" + A.getRating());

        Staff B = new Staff("Khang Pro", "HN", "FTU", 2000);
        System.out.println("Staff Name: " + B.getName());
        System.out.println("Old Salary: " + B.getSalary());
        System.out.println("New Salary: " + B.upToSalary(10));
    }
}
