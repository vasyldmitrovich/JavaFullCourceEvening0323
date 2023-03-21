package src.com.softserve.edu02.homework.taskOne;

public class WorkingWithTriangle {
    public double foundAreaTriangle(int sideOne, int sideTwo, int sideThree){
        double semiPerimeter = foundSemiPerimeter(sideOne, sideTwo, sideThree);
        return Math.sqrt((semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree)));
    }
    private double foundSemiPerimeter(int sideOne, int sideTwo, int sideThree){
        return (double)(sideOne+sideTwo+sideThree)/2;
    }
}
