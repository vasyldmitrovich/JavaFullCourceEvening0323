package com.softserve.edu4.pt;

public class Task3 {
    public static void main(String[] args) {

        /*All this code is not correct, rewrite code, please read task what you must do*/

   HTTPERROR myVar = HTTPERROR.BAD_REQUEST;

    switch(myVar) {
        case BAD_REQUEST:
            System.out.println("BAD_REQUEST-400");
            break;
        case UNAUTHORIZED:
            System.out.println(" UNAUTHORIZED-401");
            break;
        case FIXERROR:
            System.out.println("FIXERROR-402");
            break;
    }
}
}

 enum  HTTPERROR{


        BAD_REQUEST,
    UNAUTHORIZED,
      FIXERROR;


}

