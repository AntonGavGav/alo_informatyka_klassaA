public class Main {
    private static final int DEFAULT_PRICE = 40;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String input = task1.readInput();
        User user = task1.fillOutUser(input);
        int discount = task1.sumDiscounts(user);
        double price = task1.calculatePrice(discount, DEFAULT_PRICE);
        PrintData(user, discount, price);
    }

    public static void PrintData(User user, int discount, double price) {
        System.out.print("Data: ");
        System.out.print(user.getCity() + ", ");
        System.out.print(user.getAge() + " yo, ");
        System.out.println(user.getDay());
        System.out.println("Ticket price: " + price + " zł");
        System.out.println("Discount: " + discount + "%");
    }

}