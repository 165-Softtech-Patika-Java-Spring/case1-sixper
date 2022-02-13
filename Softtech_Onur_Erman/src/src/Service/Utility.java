package src.Service;


import src.Homie.House;
import src.Homie.Summery;
import src.Homie.Villa;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    static House home1 = new House(1_750_000, 3, 1, 120.0);
    static House home2 = new House(675_000, 2, 1, 90.0);
    static House home3 = new House(6_350_000, 4, 1, 180.0);

    static Villa villa1 = new Villa(5_650_500, 7, 2, 350.0);
    static Villa villa2 = new Villa(2_000_000, 9, 2, 850.0);
    static Villa villa3 = new Villa(2_200_000, 8, 2, 1400.0);

    static Summery summery1 = new Summery(1_750_000, 5, 1, 680.0);
    static Summery summery2 = new Summery(2_250_500, 6, 1, 750.0);
    static Summery summery3 = new Summery(560_000, 2, 1, 210.0);


    public static List<House> getHouse() {
        List<House> house = new ArrayList<>();

        house.add(home1);
        house.add(home2);
        house.add(home3);

        return house;
    }

    public static List<Villa> getVilla() {
        List<Villa> villas = new ArrayList<>();

        villas.add(villa1);
        villas.add(villa2);
        villas.add(villa3);

        return villas;

    }

    public static List<Summery> getSummery() {
        List<Summery> summaries = new ArrayList<>();

        summaries.add(summery1);
        summaries.add(summery2);
        summaries.add(summery3);

        return summaries;

    }

    public static void printHouse(List<House> house){

        System.out.println("All houses in the list: ");

        for(House element : house){

            System.out.println(element.getBedroom() + " bedroom " + element.getSaloon() + " saloon " +
                    element.getSize() +
                    " squarer " +
                    element.getPrice() + " TL");

        }
        System.out.println();
    }

    public static void printVilla(List<Villa> villa){

        System.out.println("All villas in the list: ");

        for(Villa element : villa){

            System.out.println(element.getBedroom() + " bedroom " + element.getSaloon() + " saloon " +
                    element.getSize() +
                    " squarer " +
                    element.getPrice() + " TL");

        }
        System.out.println();
    }

    public static void printSummery(List<Summery> summery){

        System.out.println("All summaries in the list: ");

        for(Summery element : summery){

            System.out.println(element.getBedroom() + " bedroom " + element.getSaloon() + " saloon " +
                    element.getSize() +
                    " squarer " +
                    element.getPrice() + " TL");

        }
        System.out.println();
    }
}
