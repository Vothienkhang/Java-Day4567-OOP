// +---------------------------+
//|           Nguoi           |
//+---------------------------+
//| - name: String           |
//| - age: int               |
//| - POB: String         |
//| - TeacherId: String          |
//+---------------------------+
//| + Nguoi(hoTen:String, tuoi:int, queQuan:String, maSoGV:String) |
//| + getHoTen(): String      |
//| + setHoTen(hoTen:String): void |
//| + getTuoi(): int          |
//| + setTuoi(tuoi:int): void |
//| + getQueQuan(): String    |
//| + setQueQuan(queQuan:String): void |
//| + getMaSoGV(): String     |
//| + setMaSoGV(maSoGV:String): void |
//+---------------------------+

package TeacherManagement;

public class Human {
    private String name;
    private int age;
    private String POB;
    private String TeacherID;

    public Human(String name, int age, String POB, String TeacherID) {
        this.name = name;
        this.age = age;
        this.POB = POB;
        this.TeacherID = TeacherID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPOB() {
        return POB;
    }

    public void setPOB(String POB) {
        this.POB = POB;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }
}
