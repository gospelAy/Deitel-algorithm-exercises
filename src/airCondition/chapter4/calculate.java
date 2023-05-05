package airCondition.chapter4;

public class calculate {
    public static String buyBean(int money, String location, int priceOfBeans){
        System.out.println(money + priceOfBeans);

        String beans = "custodian beans ";
        int amountWeyIGiveYouToBuyTheBeans = 500;
        int change = 300;
        return beans + change;

}
    public static String bringSoup(String person){
        String soup = "house soup";
        return soup;
    }
    public static String  cookbeans(String water, String beans){
        return beans;
    }

    public static void main(String[] args) {
        System.out.println(buyBean(500, "custodian beans", 300));
        System.out.println(bringSoup("Goodness"));
        cookbeans("clean water", "honey beans");


    }

    }