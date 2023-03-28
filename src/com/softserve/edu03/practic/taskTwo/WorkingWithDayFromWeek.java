package src.com.softserve.edu03.practic.taskTwo;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class WorkingWithDayFromWeek {

    /*I do not see main method, I can not run this cod because there is no main method, must be in each task class*/

    private Scanner scanner = new Scanner(System.in);
    public void processWorkingWithDays(){
        System.out.println("Input number from 1 to 7");
        int numberForDay = scanner.nextInt();
        Objects.checkIndex(numberForDay,8);
        foundAndOutputDayFromWeek(numberForDay);
    }
    private void foundAndOutputDayFromWeek(int numberForDay){
        DayOfWeek dayOfWeek = DayOfWeek.of(numberForDay);
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, Locale.CHINA));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ITALY));
    }
}
