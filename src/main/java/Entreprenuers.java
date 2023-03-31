public class Entrepreneurs extends People {

    private double revenue;
    private double expenses;
    public Entrepreneurs(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public double getExpenses() {
        return this.expenses;
    }



    public double calculatePay() {
        return this.revenue - this.expenses;
    }

    public String toString() {
        return "Entrepreneur " + getName() + " with revenue " + getRevenue() + " and expenses " + getExpenses();
    }
}


