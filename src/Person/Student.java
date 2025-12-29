package Person;

public class Student extends Person{
    private String program;
    private int year;
    private double score;

    public Student(String name, String address,String program, int year, double score) {
        super(name, address); //gọi constructor của Person
        this.program = program;
        this.year = year;
        this.score = score;
    }

    // Getter & Setter
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // getRating(): score < 5 => bad; score >= 5 và score < 8 => medium, score >= 8 => good

    public String getRating() {
        if(score < 5){
            return "Bad";
        } else if(score >= 5 && score < 8){
            return "medium";
        } else {return "Good";}
    }
}
