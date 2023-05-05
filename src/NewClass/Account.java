package NewClass;

public class Account {
    private String name;
    private int age;
    private String pin;
    private double balance;

    public Account(String name, int age, String pin, double balance) {
        this.name = name;
        this.age = age;
        this.pin = pin;
        this.balance = balance;
    }
    public Account(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        if (pin.equals(this.pin))this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                '}';
    }
}
