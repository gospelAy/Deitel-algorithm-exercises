public class Account {
    private String name;
    private double balance;

    public Account (){

    }
    public Account(String accountName, double balance){
        this.name = accountName;
        this.balance = balance;
    }
    public void changeName(String newName){
        this.name = newName;

    }
    public String showName(){
        return name;
    }
    public void deposit(double depositAmount){
        balance = balance + depositAmount;

    }
    public void withdraw(double amountToWithdraw){
        balance = balance - amountToWithdraw;

    }
    public double showBalance(){
      return balance;
    }

    public static void main(String[] args) {
        Account customer1 = new Account("ik", 0);
        System.out.println("The name on customer1 is " + customer1.showName());
        customer1.changeName("Billion");
        System.out.println("The name on customer1 is " + customer1.showName());
;
        System.out.println("Before deposit, the amount on my account is " + customer1.showBalance());
        customer1.deposit(6000);
        System.out.println("But after deposit, it has changed to " + customer1.showBalance());

        customer1.withdraw(2000);
        System.out.println("After withdrawal, balance has changed to " + customer1.showBalance());

        //    customer1.changeName("favour");

    }


}
