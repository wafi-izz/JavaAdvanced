package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DaysOfTheWeekTester {
    public static void main(String[] args) {
        Set<String> week1 = new HashSet<>();
        week1.add("Tuesday");
        week1.add("Saturday");
        week1.add("Friday");
        week1.add("Sunday");
        week1.add("Thursday");
        week1.add("Monday");
        week1.add("Wednesday");
        System.out.println("set 1 print:" + week1);

        Set<String> week2 = new LinkedHashSet<>();
        week2.add("Monday");
        week2.add("Tuesday");
        week2.add("Wednesday");
        week2.add("Thursday");
        week2.add("Friday");
        week2.add("Saturday");
        week2.add("Sunday");
        System.out.println("set 2 print:" + week2);

        System.out.println("are set 1 and set 2 equal? " + week1.equals(week2));
    }
}
