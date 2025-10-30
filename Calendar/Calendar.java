import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDay = date.getDayOfWeek();
        int daysInMonth = date.lengthOfMonth();
        int start = firstDay.getValue(); 
        if (start == 7) start = 0; 

        System.out.println("Calendar for the month of " + date.getMonth() + ", " + year);
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%-4d", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
    }
}
