// +----------------------------------+
//|           QuanLyCBGV             |
//+----------------------------------+
//| - danhSach: List<CBGV>           |
//+----------------------------------+
//| + QuanLyCBGV()                   |
//| + them(gv: CBGV): boolean        |
//| + xoaTheoMaSo(maSoGV:String): boolean |
//| + timTheoMaSo(maSoGV:String): CBGV    |
//| + hienThiTatCa(): void           |
//| + getDanhSach(): List<CBGV>      |
//+----------------------------------+

package TeacherManagement;

import java.util.ArrayList;
import java.util.List;

public class Management {
    private final List<Teacher> list = new ArrayList<>();

    // Search teacher by ID
    public Teacher SearchTeacherByID(String TeacherID) {
        for (Teacher teacher : list) {
            if (teacher.getTeacherID().equals(TeacherID)) {
                return teacher;
            }
        }
        return null;
    }

    // Add new teacher (remove duplicate)
    public boolean addTeacher(Teacher teacher) {
        if (SearchTeacherByID(teacher.getTeacherID()) != null) {
            return false; // duplicate teacher ID
        }
        list.add(teacher);
        return true;
    }

    // Delete teacher by ID
    public boolean deleteTeacher(String TeacherID) {
        Teacher teacher = SearchTeacherByID(TeacherID);
        if (teacher == null) {
            return false;
        } else  {
            list.remove(teacher);
            return true;
        }
    }

    public List<Teacher> getTeacherList() {
        return list;
    }

    public void ShowTeacherList() {
       if (list.isEmpty()) {
           System.out.println("There are no teachers in the system");
           return;
       }
       for (Teacher teacher : list) {
           System.out.println(teacher);
       }
    }
}
