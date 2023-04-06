package thestore.src.main.java;

public class JobField{
    public static void main(String[] args) {



        Cloth cloth1 = new Cloth("Hoodie", 50);
        Cloth cloth2 = new Cloth("Shorts", 20);
        Cloth cloth3 = new Cloth("Shirt", 10);

        Cloth[] clothingItems = {cloth1, cloth2, cloth3};


        HourlyEmployees memberOne = new HourlyEmployees("Lawrence", 22, 50, clothingItems);
        SalariedEmployees staffOne = new SalariedEmployees("Saint",50000, clothingItems);
        Entrepreneurs businessMan1 = new Entrepreneurs("Dior",1000000,70000, clothingItems);

        memberOne.printBadge();
        staffOne.printBadge();
        businessMan1.printBadge();
        memberOne.calculatePay();
        staffOne.calculatePay();
        businessMan1.calculatePay();

        //memberOne.calculateDiscount(memberOne.employeeDisc * cloth1.getPrice);

        System.out.println(cloth1.getPrice());
        System.out.println(cloth2.getPrice());
        System.out.println(cloth3.getPrice());










    }

}









