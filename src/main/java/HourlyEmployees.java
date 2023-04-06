package thestore.src.main.java;

public class HourlyEmployees extends Employees implements Worker {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployees(String name, double hourlyRate, double hoursWorked, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {

        return this.hourlyRate;
    }

    public double getHoursWorked() {

        return this.hoursWorked;
    }


    @Override
    public void calculatePay() {
        System.out.println(getName() + " an Hourly employees's  Pay is : "+ (getHourlyRate() * getHourlyRate() * 52  ));
    }

    @Override
    public void calculateDiscount() {
        System.out.println(employeeDisc);
    }
}




