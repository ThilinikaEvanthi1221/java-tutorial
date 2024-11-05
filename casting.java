public class casting {
    public static void main(String[] args) {
        double price = 100.00;
        double finalPrice = price + 18; // implicit casting

        System.out.println(finalPrice);

        int p = 100;
        int fp = p + (int) 18.0; // explicit casting
        System.out.println(fp);
    }
}
