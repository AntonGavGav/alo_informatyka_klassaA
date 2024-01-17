package singleton;

import java.util.Random;
public class LoadBalancer {
    //lazy singleton
    private static LoadBalancer instance;
    private static String[] servers = {
            "server 1",
            "server 2",
            "server 3",
            "server 4",
            "server 5",
            "server 6",
            "server 7",
            "server 8",
            "server 9",
    };
    private static Random random;


    private LoadBalancer(){
        System.out.println("Creating");
    }
    public static LoadBalancer getInstance(){
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    public static void hello(){
        System.out.println("Hello");
    }
    public String getAvailableServer(){
        Random random = new Random();
        return servers[random.nextInt(servers.length)];
    }

}
