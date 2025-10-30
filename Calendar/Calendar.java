import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");

        int year = sc.nextInt();
        System.out.print("Enter month: ");

        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);

        int daysInMonth = date.lengthOfMonth();
        DayOfWeek firstDay = date.getDayOfWeek();

        System.out.println("Calendar for the month of " + date.getMonth() + ", " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int start = firstDay.getValue() % 7;

        for (int i = 0; i < start; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + start) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        sc.close();
    }
}
