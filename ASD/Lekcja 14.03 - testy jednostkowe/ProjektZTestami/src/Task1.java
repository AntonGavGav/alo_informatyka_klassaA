import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    private HashSet<String> weekdays= new HashSet<>(){{
       add("Monday");
       add("Tuesday");
       add("Wednesday");
       add("Thursday");
       add("Friday");
       add("Saturday");
       add("Sunday");
    }};

    public String readInput(){
        System.out.println();
        System.out.println("(write your city first, then write your age, than the day you are buying the ticket)");
        System.out.print("Insert your data: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public User fillOutUser(String input){
        String[] data = input.split("\\s+|,\\s*|,");
        if(!isGivenDataCorrect(data)){
            System.out.println("You gave incorrect data");
            return null;
        }
        String city = data[0];
        int age = Integer.parseInt(data[1]);
        String day = data[2];
        User user = new User(age,city,day);
        return user;
    }

    private boolean isGivenDataCorrect(String[] data) {
        return (data.length == 3) && stringConvertableToInt(data[1]) && weekdays.contains(data[2]);
    }
    private boolean stringConvertableToInt(String text){
        try{
            int number = Integer.parseInt(text);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public int sumDiscounts(User user){
        int discount = 0;
        if(user.getAge() < 10){
            discount += 100;
        }
        else if(user.getAge() > 10 && user.getAge() <= 18){
            discount += 50;
        }

        if(user.getDay().equals("Thursday")){
            discount += 100;
        }

        if(user.getCity().equals("Warsaw")){
            discount += 10;
        }
        return discount > 100 ? 100 : discount;
    }

    public double calculatePrice(int discount, int pay_amount){
        return pay_amount - (double)pay_amount*discount/100;
    }

}
