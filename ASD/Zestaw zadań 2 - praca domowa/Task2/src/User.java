public class User {
    private String name;
    private String surname;
    private String email, password;
    private enum Account {
        GUEST,
        USER
    }
    private Account acc;
    public User(String email, String password, String name, String surname){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        acc = Account.USER;
    }
    public User(String email){
        this.email = email;
        acc = Account.GUEST;
    }
    public void ConvertToUser(String password, String name, String surname){
        if (acc == Account.USER){
            System.out.println("Already a user");
            return;
        }
        this.password = password;
        this.name = name;
        this.surname = surname;
        acc = Account.USER;
    }

}
