package NewClass;

public class Bank {
    private String customer;
    private Account account;

    public String getCustomer() {
        return customer;
    }

    public Bank(){
        account = new Account();
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customer='" + customer + '\'' +
                ", account=" + account +
                '}';
    }
}

