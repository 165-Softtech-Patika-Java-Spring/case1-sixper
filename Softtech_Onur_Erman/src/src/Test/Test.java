package src.Test;


import src.Service.*;
import java.math.*;


public class Test {

    public static void main(String[] args) {

        Utility.printHouse(Utility.getHouse());
        Utility.printVilla(Utility.getVilla());
        Utility.printSummery(Utility.getSummery());

        Services testService = new Services();

        System.out.println("Total price of all houses: " + testService.getHousePrice());
        System.out.println("Total price of all villas: " + testService.getVillaPrice());
        System.out.println("Total price of all summaries: " + testService.getSummeryPrice());
        System.out.println("Total price of all type of homes: " +
                BigDecimal.valueOf(testService.getTotalPrice()).setScale(2, RoundingMode.CEILING));

        System.out.println("\nAverage size of houses: " + testService.getAverageHouseSize() + " square meter");
        System.out.println("Average size of villas: " +
                BigDecimal.valueOf(testService.getAverageVillaSize()).setScale(2, RoundingMode.CEILING) + " square meter");
        System.out.println("Average size of summaries: " +
                BigDecimal.valueOf(testService.getAverageSummerySize()).setScale(2, RoundingMode.CEILING) + " square meter");
        System.out.println("Average size of all type of homes: " +
                BigDecimal.valueOf(testService.getAverageTotalSize()).setScale(2, RoundingMode.CEILING) + " square meter");


        testService.filter(3,1);
        testService.filter(7,2);
        testService.filter(5,3);


    }
}
