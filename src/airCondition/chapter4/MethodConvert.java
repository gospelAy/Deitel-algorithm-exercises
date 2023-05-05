package airCondition.chapter4;

public class MethodConvert {
    public static void main(String[] args){
        convert("");
//        String date = "01/05/1970";
//        date.replaceAll(date, "01/May/1970");
//        System.out.println(date);
    }
    public static void convert(String date){
        String date3 = "01 may, 1970";
        String day4 = "01/05/1970";
        if (!date3.equals(day4))
            System.out.println(date3);
    }
}
