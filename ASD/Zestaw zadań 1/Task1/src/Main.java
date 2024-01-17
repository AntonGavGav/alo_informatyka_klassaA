// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
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
