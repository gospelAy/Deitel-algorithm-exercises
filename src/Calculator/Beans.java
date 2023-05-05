package Calculator;

import jdk.dynalink.beans.StaticClass;

public class Beans {
    public static String buyBeans( String money, int priceOfBeans){
        String beans = "Custodian Beans only";

        int change = 100;

        return beans + change;
    }

    public static void carryTheBeansHome() {
        for (int counter = 0; counter < 100000; counter++) {
            System.out.println("He is going home.......");
        }
        System.out.println("He have arrived home finally");
    }
    public static void cookBeans(){
        System.out.println("Beans don set o...... ");

    }
    public static String bringTheBeansBack(String road, int transport){
        return road;
    }

    public static void main(String[] args) {
        bringTheBeansBack("Blessing road", 1000);
        buyBeans("10", 45);
        cookBeans();
        carryTheBeansHome();
        cookBeans();
        bringTheBeansBack("mile 2 road", 1000);


    }



}
