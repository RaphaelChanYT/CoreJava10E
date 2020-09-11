import java.time.LocalDate;

public class P144_4_2_CalendarTest_ChangeAsYear {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        //var thisMonth = today.getMonth();
        var valueToday = today.getDayOfYear();
        //System.out.println(thisMonth);
        //System.out.println(valueToday);

        var whichDayThisYear = today.getDayOfYear();
        //System.out.println(whichDayThisYear);

        var workDay = today;
        workDay = workDay.minusDays(whichDayThisYear-1);
        //System.out.println(workDay);

        while(workDay.getYear() == 2020){
            if(workDay.getMonth().getValue() != 1)
                System.out.println();
            System.out.println(workDay.getMonth());
            System.out.println("Mon Tue Wed Thu Fri Sat Sun ");
            var weekValue = workDay.getDayOfWeek().getValue();
            for(int i_1 = 1; i_1<weekValue; i_1++){
                System.out.print("    ");
            }
            var focusMonth = workDay.getMonth();
            while(workDay.getMonth() == focusMonth){
                System.out.printf("%3d", workDay.getDayOfMonth());
                if(workDay.getDayOfYear() == valueToday)
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(workDay.getDayOfWeek().getValue() == 7)
                    System.out.println();
                workDay = workDay.plusDays(1);
            }
            if(workDay.getDayOfWeek().getValue()!=1)
               System.out.println();
        }


    }
}
