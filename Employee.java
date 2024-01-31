import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private int id;
    private String name;
    private double Salary;

    public Employee(int id, String name, double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = (percent / 100) * Salary;
            Salary += raiseAmount;
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID:" + id);
        System.out.println("Employee name:" + name);
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("Employee Salary:" + indianCurrencyFormat.format(Salary));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 50000.0);
        System.out.println("Initial Employee Details:");
        emp1.displayEmployeeDetails();
        emp1.raiseSalary(10);
        System.out.println("\nEmployee Details After Raise:");
        emp1.displayEmployeeDetails();
    }

}
