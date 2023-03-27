import java.util.Scanner;

public class hw_4_4 {
    public static void main(String[] args){
        System.out.println("Enter thw amount of students: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input){
            case 342:
                System.out.print("We had "+Faculty.Season.WINTER.getStud()+" students ");
                System.out.println("In "+Faculty.Season.WINTER.getSe());
                break;
            case 543:
                System.out.print("We had "+Faculty.Season.SPRING.getStud()+" students ");
                System.out.print("In "+Faculty.Season.SPRING.getSe());
                break;
            case 412:
                System.out.print("We had "+Faculty.Season.SUMMER.getStud()+" students ");
                System.out.print("In "+Faculty.Season.SUMMER.getSe());
                break;
            case 235:
                System.out.print("We had "+Faculty.Season.FALL.getSe()+" students ");
                System.out.print("In "+Faculty.Season.FALL.getStud());
                break;
            default:
                System.out.println("We have not got this amount of student ever!");

        }

    }
}
class Faculty{
    public enum Season {
        WINTER ("Winter",342),
        SPRING ("Spring",543),
        SUMMER ("Summer", 412),
        FALL ("Fall",235);
        private final String se;
        private final int stud;
        Season(String se,int stud) {
            this.se = se;
            this.stud = stud;

        }
        public String getSe(){
            return se;
        }
        public int getStud(){
            return stud;
        }

    }



}