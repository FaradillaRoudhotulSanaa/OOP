package Faradilla.Polymorphism.Percobaan1;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("------------------------");
        System.out.println("" + pEmp + "\n" + pEmp.getEmployeeInfo());
    }
}
