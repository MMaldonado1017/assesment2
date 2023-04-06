public class Entrepreneurs extends Person implements Worker {

    private double revenue;
    private double expenses;
    private final double entreDiscount=.15;
    public Entrepreneurs(String name, double revenue, double expenses, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.revenue = revenue;
        this.expenses = expenses;
    }
    public double getRevenue() {
        return this.revenue;
    }

    public double getExpenses() {
        return this.expenses;
    }

    @Override
    public void printBadge() {
        System.out.println(getName());
        

    }





    public String toString() {
        return "Entrepreneur " + getName() + " with revenue " + getRevenue() + " and expenses " + getExpenses();
    }

    @Override
    public void calculatePay() {
        System.out.println( getName()+ "'s an Entreprenuer his pay is : " + (getRevenue() - getExpenses()));
    }

    @Override
    public void calculateDiscount() {

    }
}


