package TeacherManagement;

public class Test {
    public static void main(String[] args) {
        Management management = new Management();

        Teacher t1 = new Teacher("VÕ THIỆN KHANG", 30, "BẾN TRE", "KV001",
                10000000, 5000000, 500000);

        Teacher t2 = new Teacher("Nguyễn Văn A", 35, "TPHCM", "AN002",
                10000000, 3000000, 2000000);

        System.out.println("Add teacher: " + management.addTeacher(t1));
        System.out.println("Add teacher: " + management.addTeacher(t2));
        System.out.println("Add duplicate teacher t1: " + management.addTeacher(t1));

        System.out.println("\n----List-----");
        management.ShowTeacherList();

        System.out.println("\n---Delete t1: " + management.deleteTeacher("KV001"));
        System.out.println("The final list after remove is: ");
        management.ShowTeacherList();
    }
}
