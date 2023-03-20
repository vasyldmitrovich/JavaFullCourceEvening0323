package src.com.softserve.edu01.practic.taskFour;

import java.util.Scanner;

public class WorkingWithTextInQuestion {
    private Scanner scanner = new Scanner(System.in);
    public void processWorkingWithQuestion(){
        System.out.println("How are you?");
        String answerUser = scanner.nextLine();
        System.out.println("You are answer: "+answerUser);
    }
}
