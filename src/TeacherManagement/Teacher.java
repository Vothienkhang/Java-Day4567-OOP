//                 ▲
//                | extends
//+---------------------------+
//|           Teacher            |
//+---------------------------+
//| - BasicSalary: double       |
//| - BonusSalary: double     |
//| - Penalty: double        |
//+---------------------------+
//| + CBGV(name:String, age:int, POB:String, TeacherID:String,   |
//|       luongCung:double, luongThuong:double, tienPhat:double)    |
//| + getLuongCung(): double  |
//| + setLuongCung(luongCung:double): void |
//| + getLuongThuong(): double|
//| + setLuongThuong(luongThuong:double): void |
//| + getTienPhat(): double   |
//| + setTienPhat(tienPhat:double): void |
//| + tinhLuongThucLinh(): double |
//+---------------------------+

package TeacherManagement;

public class Teacher extends Human {
    private double BasicSalary;
    private double BonusSalary;
    private double Penalty;

    public Teacher(String name, int age, String POB, String TeacherID, double BasicSalary, double BonusSalary, double Penalty) {
        super(name, age, POB, TeacherID);
        this.BasicSalary = BasicSalary;
        this.BonusSalary = BonusSalary;
        this.Penalty = Penalty;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public double getBonusSalary() {
        return BonusSalary;
    }

    public void setBonusSalary(double BonusSalary) {
        this.BonusSalary = BonusSalary;
    }

    public double getPenalty() {
        return Penalty;
    }

    public void setPenalty(double Penalty) {
        this.Penalty = Penalty;
    }

    // Calculate Net Salary
    public double calculateNetSalary() {
        return BasicSalary + BonusSalary - Penalty;
    }

    @Override
    public String toString() {
        return "Teacher {" + "TeacherID =" + getTeacherID() + ", Name = " + getName() + ", Age = " + getAge() + ", Place of birth = "
                + getPOB() +
                ", BasicSalary = " + getBasicSalary() +
                ", BonusSalary = " + getBonusSalary() +
                ", Penalty = " + getPenalty() +
                ", NetSalary = " + calculateNetSalary() + '}';
    }



}
