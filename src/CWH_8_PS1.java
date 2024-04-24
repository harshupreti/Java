import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class CWH_8_PS1 {
    public static void main(String[] args) {
        Employee harsh = new Employee();
        harsh.setName("Harsh");
        harsh.salary = 25;
        System.out.println(harsh.getName());
        System.out.println(harsh.getSalary());

    }
}
