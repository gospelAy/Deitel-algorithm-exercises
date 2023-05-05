package NewClass;

public class Main {
    public static void main(String[] args) {
        Account ikAccount = new Account("Spencer", 25, "1234", 2000.0);
        Account spencer = new Account("peter", 50, "1234", 10000.0);
        Bank zenithBank = new Bank();
//        zenithBank.setAccount(ikAccount);
//        zenithBank.setCustomer("Ikechukwu");
//        zenithBank = null;
//        System.out.println(ikAccount.getAge());
//        System.out.println(zenithBank.getAccount().getAge());

        Bank jaizBank = new Bank();
        jaizBank.getAccount().setAge(12);
        jaizBank.getAccount().setName("GGhdhhd");
        jaizBank.getAccount().setPin("12333");

        System.out.println(jaizBank.getAccount());
        jaizBank = null;
        System.out.println(jaizBank.getAccount());
    }
}
