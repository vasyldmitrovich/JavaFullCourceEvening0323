package src.com.softserve.edu01.homework.taskThree;

import java.util.Scanner;

public class WorkingWithCostCallFromCountry {
    private double priceForOneCountry;
    private double priceForTwoCountry;
    private double priceForThreeCountry;
    private Scanner scanner = new Scanner(System.in);
    private int durationForOneCountry;
    private int durationForTwoCountry;
    private int durationForThreeCountry;
    public void startWorkingWithOperation(){
        setPricesForCountry();
        setDurationForCountries();
        getResultPriceForPhoneCall();
    }
    private void getResultPriceForPhoneCall(){
        System.out.println("Price for first call = "+(priceForOneCountry*durationForOneCountry));
        System.out.println("Price for two call = "+(priceForTwoCountry*durationForTwoCountry));
        System.out.println("Price for three call = "+(priceForThreeCountry*durationForThreeCountry));
        System.out.println("Total cost = "+((priceForOneCountry*durationForOneCountry)+(priceForTwoCountry*durationForTwoCountry)+(priceForThreeCountry*durationForThreeCountry)));
    }
    private void setPricesForCountry(){
        System.out.println("Input price for first country:");
        priceForOneCountry = scanner.nextDouble();
        System.out.println("Input price for second country:");
        priceForTwoCountry = scanner.nextDouble();
        System.out.println("Input price for three country:");
        priceForThreeCountry = scanner.nextDouble();
    }
    private void setDurationForCountries(){
        System.out.println("Input duration for first country:");
        durationForOneCountry = scanner.nextInt();
        System.out.println("Input duration for second country:");
        durationForTwoCountry = scanner.nextInt();
        System.out.println("Input duration for three country:");
        durationForThreeCountry = scanner.nextInt();
    }
}
