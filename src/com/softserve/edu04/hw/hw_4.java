import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of students --> ");
        int a = sc.nextInt();

        switch(a){
            case 150:
                System.out.print("We have "+ Faculty.Season.WINTER.getStud()+" students ");
                System.out.print(" in " +  Faculty.Season.WINTER.getEn()+" season");
                break;
            case 245:
                System.out.print("We have "+ Faculty.Season.SPRING.getStud()+" students ");
                System.out.print(" in " +  Faculty.Season.SPRING.getEn()+" season");
                break;
            case 132:
                System.out.print("We have "+ Faculty.Season.SUMMER.getStud()+" students ");
                System.out.print(" in " +  Faculty.Season.SUMMER.getEn()+" season");
                break;
            case 184:
                System.out.print("We have "+ Faculty.Season.AUTUMN.getStud()+" students ");
                System.out.print(" in " +  Faculty.Season.AUTUMN.getEn()+" season");
                break;
            default:
                System.out.println("We don't have this count of students at any season !!! ");
        }



    }
}

class Faculty{
    public int Students_amount;

    public Faculty(int students_amount) {
        Students_amount = students_amount;
    }

    public enum Season {
        WINTER( "Winter", 150),
        SPRING( "Spring", 245),
        SUMMER( "Summer", 132),
        AUTUMN( "Autumn",184);

        private final String en;
        private final int stud;
        Season( String en,int stud) {
            this.en = en;
            this.stud = stud;
        }

        public String getEn() {
            return en;
        }
        public int getStud() {
            return stud;
        }
    }


}