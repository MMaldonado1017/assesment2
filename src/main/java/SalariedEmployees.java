public class SalariedEmployees extends Employees {
    private double salary;

    public SalariedEmployees(String name,double salary) {
        super(name);

        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public double calculatePay() {
        return this.salary;
    }
}








