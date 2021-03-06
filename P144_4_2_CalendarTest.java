import java.time.LocalDate;

/**
* Test in 4.2
* Make a month calendar
* Core Java 10e
 */

public class P144_4_2_CalendarTest {
    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now();
        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);
        int value = weekday.getValue();
        System.out.println(value);*/

        LocalDate focusDate = LocalDate.now();
        var thisMonth = focusDate.getMonth();
        var valueToday = focusDate.getDayOfMonth();
        //System.out.println(thisMonth);
        //System.out.println(valueToday);

        LocalDate firstDateInMonth = focusDate.minusDays(valueToday-1);
        //System.out.println(firstDateInMonth);
        var weekValueFDiM = firstDateInMonth.getDayOfWeek().getValue();
        //System.out.println(weekValueFDiM);

        System.out.println(thisMonth);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun ");
        for(int i_1 = 1; i_1 < weekValueFDiM; i_1++){
            System.out.print("    ");
        }
        var checkMonth = firstDateInMonth.getMonth();
        var checkDay = firstDateInMonth;
        while(checkMonth == thisMonth){
            checkDay = checkDay.plusDays(1);
            checkMonth = checkDay.getMonth();
        }
        var numberOfMonthDay = checkDay.minusDays(1).getDayOfMonth();
        //System.out.println(numberOfMonthDay);


        for(int i_2 = 1; i_2<=numberOfMonthDay; i_2++){
            System.out.printf("%3d", firstDateInMonth.getDayOfMonth());

            if(firstDateInMonth.getDayOfMonth() == valueToday)
                System.out.print("*");
            else
                System.out.print(" ");

            if(firstDateInMonth.getDayOfWeek().getValue() == 7){
                System.out.println();
            }

            firstDateInMonth = firstDateInMonth.plusDays(1);
        }


        if(firstDateInMonth.getDayOfWeek().getValue() != 1)
            System.out.println();


    }
}
