public class StudentModifier {
    private String name = "John";
    private String classname = "C01";

    // Constructor
    public StudentModifier() {
    }

    // Method
    public void setName(String name) {
        this.name = name;
    }

    public void setClass(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', classes='" + classname + "'}";
    }
}
