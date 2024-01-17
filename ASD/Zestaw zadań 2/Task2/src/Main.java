import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static void Task4(){
        User per = new User("anton@gmail.com");
        User per1 = new User("EventfulLynx915", "BobBob77", "Anton", "Gavrylenko");

        Product cookies = new Product("Cookie", 15, 00000,3);
        Product monkeys = new Product("Monkey", 10, 00000,4);

        Basket basket = new Basket();
        Basket basket1 = new Basket(per);
        Basket basket2 = new Basket(per1, new Product[]{cookies, monkeys});
        basket1.AddProducts(new Product[]{cookies, cookies,cookies,monkeys,monkeys});//will be only two cookies bc one was taken previously
        basket1.RemoveProducts(new Product[]{monkeys});
        System.out.println(basket1.Pay());
        System.out.println(basket2.Pay());
    }
    public static void Task3(){
        Product cookies = new Product("Cookie", 30, 915);
        Product oreos = new Product("Oreo", 30, 915);
        Product bizkits = new Product("Bizkits", 10, 10);
        Product legos = new Product("Legos", 10, 109);

        Product[] products = {cookies, oreos};
        Category cat = new Category("sweets", products);
        Category cat1 = new Category();
        Category cat2 = new Category("water");

        cat1.addProducts(new Product[] {legos});
        cat2.addProducts(new Product[] {bizkits});


        System.out.println(Arrays.toString(cat.getProductNames()));
        cat.addProducts(new Product[] {bizkits, legos});
        System.out.println(Arrays.toString(cat.getProductNames()));
        cat.removeProducts(new Product[]{oreos,bizkits});
        System.out.println(Arrays.toString(cat.getProductNames()));
    }
    public static void Task1(){
        User per1 = new User("gavrylenko.anton@gmail.com");
        User per2 = new User("anton@gmail.com");
        User per3 = new User("EventfulLynx915", "BobBob77", "Anton", "Gavrylenko");
        per2.ConvertToUser("BibBub", "EventfulLynx","915");
    }
    static void Task2(){
        Product cookies = new Product("Cookie", 30, 915);
        Product oreos = new Product("Oreo", 9, 915915915);
        Product ice = new Product("Ice", 1, 705, 3);
        oreos.SetPrice(5);
        cookies.SetCount(8);
        System.out.println(oreos.GetCount());
        System.out.println(oreos.GetPrice());
    }
}
