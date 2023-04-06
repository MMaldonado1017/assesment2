package thestore.src.main.java;

public class Cloth {
    public double getPrice;
    private String description;
    private double price;

    public Cloth(String description, double price) {
        this.description = description;
        this.price = price;

    }



    public double getPrice(){
        return this.price;
    }


}
