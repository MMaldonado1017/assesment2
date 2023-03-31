public abstract class  People {
    private String name;
    public People(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract void printBadge();
    public static void printPay(People[] person) {
        for ( People person : person) {
            System.out.println(person.name() + " gets paid " + person.calculatePay());
        }
    }


    public abstract double calculatePay();
}

