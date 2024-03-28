abstract class Employee {
    abstract void printInfo();

    void companyInfo() {
        System.out.println("employee of PT. cutraysha.tz");
    }
}

class NewEmployee extends Employee {
    @Override
    void printInfo() {
        String name = "Isyul";
        int age = 19;
        float salary = 200.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class OldEmployee extends Employee {
    @Override
    void printInfo() {
        String name = "Raysha";
        int age = 24;
        float salary = 500.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

