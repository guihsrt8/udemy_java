public class exercicio {

    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;
        

        System.out.println("products:");
        System.out.printf("%s, which price is $ %.2f%n" +  "%s, which price is $ %.2f%n", product1, price1, product2, price2);
        
        System.out.printf("Record: " + "%d years old, code %d and gender: %s", age, code, gender);
        
    }
}