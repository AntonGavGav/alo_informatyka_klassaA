import Task1.BicyclicRes;
import Task1.Task1;
import Task2.BCDRes;
import Task2.Task2;
import Task3.MaxDecimalRes;
import Task3.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "./binarne.txt";
        ArrayList<String> binary_numbers = MyFileReader.readFile(path);

        System.out.println();
        Task1 task1 = new Task1();
        BicyclicRes bclc_res = task1.findBicyclic(binary_numbers);
        bclc_res.printRes();
        System.out.println("------915------");
        Task2 task2 = new Task2();
        BCDRes bcdRes = task2.findIncorrectBCDs(binary_numbers);
        bcdRes.printRes();
        System.out.println("------915------");
        Task3 task3 = new Task3();
        MaxDecimalRes maxDRes = task3.getMaxDecimal(binary_numbers);
        maxDRes.printRes();
    }
}