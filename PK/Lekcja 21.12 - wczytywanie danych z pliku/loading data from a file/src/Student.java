import java.util.ArrayList;

public class Student {
    private String name, surname, password;
    private int min_character = '!';
    private int max_character = '~';

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public Student(String name, String surname, String password ){
        this.name = name;
        this.surname = surname;
        this.password = decrypt(password);
    }

    /*we have some symbols inside the data.csv file,
     so I decided that encryption will work between the
     "!"(33) and "~"(126) character*/
    public String decrypt(String password) {
        char[] res = password.toCharArray();
        for (int i = 0; i < res.length; i++) {
            int new_value = change_value(max_character,min_character,res[i], -5);
            res[i] = (char)(new_value);
        }
        return new String(res);
    }
    public String encrypt(String password){
        char[] res = password.toCharArray();
        for (int i = 0; i < res.length; i++) {
            int new_value = change_value(max_character,min_character,res[i], 5);
            res[i] = (char)(new_value);
        }
        return new String(res);
    }
    private int change_value(int max, int min, int current, int k){
        int new_value = current+k;
        if (new_value > max){
            new_value = Math.floorMod(new_value, max);
            new_value += min-1;
        } else if (new_value < min) {
            new_value = max - (min - new_value) + 1;
        }
        return new_value;
    }
}
