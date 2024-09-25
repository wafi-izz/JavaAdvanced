package month_enum;

public class MonthTester {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if (month.name().endsWith("y")) {
                System.out.println(month.name() + " ends with y");
            } else {
                System.out.println(month.name() + " doesn't end with y");
            }
        }
    }
}