public class HourlyEmployees extends Employees {
    private double hourlyWage;
    private double weeklyHours;

    public HourlyEmployees(String name, double hourlyWage, double hoursWorked) {
        super(name);

        this.hourlyWage = hourlyWage;
        this.weeklyHours = weeklyHours;
    }

    public double getHourlyRate() {
        return this.hourlyWage;
    }

    public double getHoursWorked() {
        return this.weeklyHours;
    }

    public double calculatePay() {
        return this.hourlyWage * this.weeklyHours;
    }
}




