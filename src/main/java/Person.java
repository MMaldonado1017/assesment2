package thestore.src.main.java;

public abstract class Person implements Discount{
    private String name;
    private Cloth[] clothingItems;    //added for homework

    public Person(String name, Cloth[] clothingItems) {
        this.name = name;
        this.clothingItems = clothingItems;
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

//        public double calculateDiscount() {
//            double discount = 0.1;
//            if (this instanceof Manager) {
//                discount += 0.05;
//            } else if (this instanceof Entrepreneurs) {
//                discount += 0.02;
//            }
//            double totalDiscount = 0.0;
//            for (Cloth item : this.clothingItems) {
//                totalDiscount += item.getPrice() * discount;
//            }
//            return totalDiscount;
//        }

    }




}















