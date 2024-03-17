import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void fillOutUser_IncorrectDataMoreThan3Parameters_Null() {
        String input = "Warsaw, 15, Friday, Something more";
        assertNull(task1.fillOutUser(input));
    }

    @Test
    void fillOutUser_IncorrectDataLessThan3Parameters_Null() {
        String input = "Warsaw, 15";
        assertNull(task1.fillOutUser(input));
    }

    @Test
    void fillOutUser_IncorrectOrder_Null() {
        String input = "15, Friday, Warsaw";
        assertNull(task1.fillOutUser(input));
    }

    @Test
    void fillOutUser_IncorrectDay_Null() {
        String input = "Warsaw, 15, Something";
        assertNull(task1.fillOutUser(input));
    }

    @Test
    void fillOutUser_IncorrectAge_Null() {
        String input = "Warsaw, something, Friday";
        assertNull(task1.fillOutUser(input));
    }

    @Test
    void fillOutUser_CorrectData_newUser() {
        String input = "Warsaw, 15, Friday";
        User expected = new User(15, "Warsaw", "Friday");
        User actual = task1.fillOutUser(input);
        assertEquals(expected.getCity(), actual.getCity());
        assertEquals(expected.getDay(), actual.getDay());
        assertEquals(expected.getAge(), actual.getAge());
    }


    @Test
    void sumDiscounts_AgeLessThanTenAndDayIsThursday_100(){
        String day = "Thursday";
        String city = "Some";
        int age = 9;
        User user = new User(age, city,day);

        int expected = 100;
        int actual = task1.sumDiscounts(user);
        assertEquals(expected, actual);
    }

    @Test
    void sumDiscounts_DayIsThursday_100(){
        String day = "Thursday";
        String city = "Some";
        int age = 99;
        User user = new User(age, city,day);

        int expected = 100;
        int actual = task1.sumDiscounts(user);
        assertEquals(expected, actual);
    }

    @Test
    void sumDiscounts_AgeIs17_50(){
        String day = "Friday";
        String city = "Some";
        int age = 17;
        User user = new User(age, city,day);

        int expected = 50;
        int actual = task1.sumDiscounts(user);
        assertEquals(expected, actual);
    }

    @Test
    void sumDiscounts_AgeIs11CityIsWarsaw_60(){
        String day = "Friday";
        String city = "Warsaw";
        int age = 11;
        User user = new User(age, city,day);

        int expected = 60;
        int actual = task1.sumDiscounts(user);
        assertEquals(expected, actual);
    }





    @Test
    void calculatePrice_PayAmountIs40DiscountIs50_20(){
        int pay_amount = 40;
        int discount = 50;
        double expected = 20;
        assertEquals(expected, task1.calculatePrice(discount,pay_amount));
    }

    @Test
    void calculatePrice_PayAmountIs40DiscountIs100_0(){
        int pay_amount = 40;
        int discount = 100;
        double expected = 0;
        assertEquals(expected, task1.calculatePrice(discount,pay_amount));
    }

}