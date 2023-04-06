public abstract class Employees extends Person {
    private static int badgeIDNumber = 1;
    private int badgeID;

    public Employees(String name, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.badgeID = badgeIDNumber;
    }


    public int getBadgeIDNumber() {
        return this.badgeID;
    }



    public void printBadge() {

        System.out.println(getName()  +"  Employee ID: " + this.getBadgeIDNumber());
    }
}



