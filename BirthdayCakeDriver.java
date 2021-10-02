public class BirthdayCakeDriver {
    public static void main(String[] args) {
        CakeBakery bakery = new CakeBakery();

        bakery.placeOrder(args[0]);
        bakery.placeOrder(args[1]);
        bakery.placeOrder(args[2]);
        bakery.placeOrder(args[3]);

    }
}
