package tdd;

public class Accounts {
    private  int deposit;
    private int fixDeposit;
    private String name;
    private String type;
    private  int balance;

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setFixedDeposit(int fixedDeposit) {
        this.fixDeposit = fixedDeposit;
    }

    public int getFixedDeposit() {
        if (fixDeposit < 1000) fixDeposit = 0;
        return fixDeposit;
    }

    public void setType() {

    }


}
