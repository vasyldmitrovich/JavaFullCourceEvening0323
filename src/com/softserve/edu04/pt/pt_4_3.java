import java.util.Scanner;

public class pt_4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country: ");
        String input = sc.nextLine();
        switch (input){
            case "Ukraine":
                System.out.println(countr.country.Ukraine.getCt());
                break;
            case "USA":
                System.out.println(countr.country.USA.getCt());
                break;
            case "Nigeria":
                System.out.println(countr.country.Nigeria.getCt());
                break;
            case "Brazil":
                System.out.println(countr.country.Brazil.getCt());
                break;
            default:
                System.out.println("You wrote wrong country!");
                break;

        }

    }
}class countr {
    public enum country {
        Ukraine( "Eurasia"),
        USA( "North America"),
        Nigeria( "Africa"),
        Brazil( "South America");

        private final String ct;
        country(String ct){
            this.ct = ct;
        }
        public String getCt(){
            return ct;
        }
        }
}