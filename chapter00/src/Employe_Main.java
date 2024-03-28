public class Employe_Main {
    public static void main(String[] args) {
        NewEmployee newEmployee = new NewEmployee();
        OldEmployee oldEmployee = new OldEmployee();

        newEmployee.printInfo();
        newEmployee.companyInfo();

        oldEmployee.printInfo();
        oldEmployee.companyInfo();
    }
}