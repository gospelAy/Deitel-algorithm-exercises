package chapterThree;

public class Account {
    private String name;
    private String email;
    private double balance;


    public Account(String name, String email, double balance){
        this.name = name;
        this.email = email;
        this.balance = balance;


    }

    public Account() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

}
