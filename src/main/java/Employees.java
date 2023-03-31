public abstract class Employees {
    private static int badegeIDNumber = 1;
    private int badgeID;

    public Employees(String name) {
        this.badgeID = badegeIDNumber++;
    }

    public int getId() {
        return this.badgeID;
    }

    public abstract double calculatePay();

    public void printBadge() {
        System.out.println("Employee ID: " + this.getId());
    }
}



