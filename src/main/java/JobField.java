public class JobField {
    public static void main(String[] args) {

        Cloth cloth= new Cloth("business casual",50);
        Cloth cloth2= new Cloth("Suit",300);
        Cloth cloth3= new Cloth("Polo and Slacks",40);
        Cloth[]clothingItems={cloth,cloth2,cloth3};
        HourlyEmployees memberOne= new HourlyEmployees("Lawrence", 22, 50,clothingItems);
        SalariedEmployees staffOne = new SalariedEmployees("Saint",50000,clothingItems);
        Entrepreneurs businessMan1= new Entrepreneurs("Dior",1000000,70000,clothingItems);

        memberOne.printBadge();
        staffOne.printBadge();
        businessMan1.printBadge();
        memberOne.calculatePay();
        staffOne.calculatePay();
        businessMan1.calculatePay();






    }

    }









