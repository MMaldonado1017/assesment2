package thestore.src.main.java;

public class Manager extends Employees implements Discount {

    private final double managerDisc = .15;

    public Manager(String name, double salary, Cloth[] clothingItems) {
        super(name, clothingItems);
    }


    @Override
    public void calculateDiscount() {
        System.out.println(managerDisc);
    }
}


