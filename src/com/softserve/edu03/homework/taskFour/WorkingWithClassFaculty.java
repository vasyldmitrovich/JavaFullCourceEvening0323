package src.com.softserve.edu03.homework.taskFour;

import java.util.Objects;
import java.util.Scanner;

public class WorkingWithClassFaculty {
    private Scanner scanner = new Scanner(System.in);
    public void startProcessWorking(){
        System.out.print("Input count student: ");
        int countStudents = scanner.nextInt();
        System.out.println("Choose please season\n1)Winter\n2)Spring\n3)Summer\n4)Autumn");
        int selectSeason = scanner.nextInt();
        createAndOutputFaculty(countStudents,selectSeason);
    }
    private boolean createAndOutputFaculty(int countStudents, int selectSeason){
        Faculty faculty = null;
        if(countStudents < 0){
            System.out.println("count students less than zero!");
            return false;
        }
        switch (selectSeason){
            case 1 -> faculty = new Faculty(countStudents,Season.First_Season);
            case 2 -> faculty = new Faculty(countStudents,Season.Two_Season);
            case 3 -> faculty = new Faculty(countStudents, Season.Three_Season);
            case 4 -> faculty = new Faculty(countStudents, Season.Four_Season);
            default -> System.out.println("Error chose ");
        }
        if(faculty != null){
            System.out.println(faculty);
            return true;
        }
        return false;
    }
}
