public abstract class  Person implements Discounts{
    private String name;
    private Cloth[] clothingItems;    //added for homework


    public Person(String name, Cloth[] clothingItems) {
        this.name = name;
        this.clothingItems=clothingItems;

    }


    public String getName() {
        return this.name;
    }

    public Cloth[] getClothingItems() {
        return this.clothingItems;
    }

    public abstract void printBadge();

    public static void printPay(Worker[] workers) {
        for (Worker worker : workers) {
            worker.calculatePay();
        }

    }




}















