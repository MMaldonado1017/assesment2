public class Employees extends People{
    private int badgeID;
    private static int randomizer=0;

    public Employees(String name) {
        super(name);
        this.badgeID= randomizer++;


    }
    public int getBadgeID(){
        return this.badgeID;
    }



    @Override
    public void printBadge() {

    }
}
