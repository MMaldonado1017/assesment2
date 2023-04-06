public class SalariedEmployees extends Employees implements Worker {
    private double salary;

    public SalariedEmployees(String name, double salary, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }


    @Override
    public void calculatePay() {
        System.out.println(getName()+ "  a Salaried Employee pay is :" + getSalary());

    }

    @Override
    public void calculateDiscount() {
        ;

    }
}









