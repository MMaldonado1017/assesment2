public class JobField {
    public static void main(String[] args) {
        HourlyEmployees memberOne= new HourlyEmployees("Lawrence", 22, 50);
        SalariedEmployees staffOne= new SalariedEmployees("Saint",50000);
        Entrepreneurs businessMan1= new Entrepreneurs("Dior",1000000,70000);
        memberOne.printBadge();
        staffOne.printBadge();
        System.out.println(businessMan1.toString());
        People[] person = {memberOne,staffOne,businessMan1};
        People.printPay(person);
    }

    }





    }


}
