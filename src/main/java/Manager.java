public class Manager extends Employees  {
    private final double employeeDisc=.15;
    public Manager(String name, double salary, Cloth[] clothingItems) {
        super(name, clothingItems);
    }


    @Override
    public void calculateDiscount() {

    }
}


