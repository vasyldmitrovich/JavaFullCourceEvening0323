import java.util.Scanner;

public class hw_3 {
    enum http_error{
        Error_404("Not Found"),
        Error_410("Gone"),
        Error_502("Bad Gateway"),
        Error_301("Moved Permanently");
        private String meaning;

        http_error(String error_mean) {
            this.meaning = error_mean;
        }

        public String getUrl() {
            return meaning;
        }
    }
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter ERROR code (404, 410, 502, 301) --> ");
        int a = sc.nextInt();

        switch (a){
            case 404:
                System.out.println("Error meaning -- > " + http_error.Error_404.getUrl());
                break;
            case 410:
                System.out.println("Error meaning -- > " + http_error.Error_410.getUrl());
                break;
            case 502:
                System.out.println("Error meaning -- > " + http_error.Error_502.getUrl());
                break;
            case 301:
                System.out.println("Error meaning -- > " + http_error.Error_301.getUrl());
                break;
        }
    }
}






