package singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LoadBalancer.hello();
        System.out.println(LoadBalancer.getInstance());

       System.out.println(LoadBalancer.getInstance().getAvailableServer());
       System.out.println(LoadBalancer.getInstance().getAvailableServer());
       System.out.println(LoadBalancer.getInstance().getAvailableServer());
       System.out.println(LoadBalancer.getInstance().getAvailableServer());

    }
}