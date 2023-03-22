package src.com.softserve.edu02.example;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Evgen",4.5);
        Student studentTwo = new Student("Maks", 2.9);
        Student studentThree = new Student("Bob", 3.9);
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(Student.avrRating(studentOne,studentTwo,studentThree));
        System.out.println(Student.totalRating(studentOne,studentTwo,studentThree));
    }
}
