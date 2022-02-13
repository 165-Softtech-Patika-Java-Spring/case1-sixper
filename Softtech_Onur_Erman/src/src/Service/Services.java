package src.Service;


import src.Homie.*;

import java.util.List;

public class Services {

    public double getHousePrice(){

        List<House> house = Utility.getHouse();
        double price = 0.0;

        for(House element : house){
            price += element.getPrice();
        }

        return price;

    }

    public double getVillaPrice(){

        List<Villa> villa = Utility.getVilla();

        double price = 0.0;

        for(Villa element : villa){
            price += element.getPrice();
        }

        return price;

    }

    public double getSummeryPrice(){

        List<Summery> summery = Utility.getSummery();

        double price = 0.0;

        for(Summery element : summery){
            price += element.getPrice();
        }

        return price;

    }

    public double getTotalPrice(){

        double totalPrice = getHousePrice() + getVillaPrice() + getSummeryPrice();

        return totalPrice;

    }

    public double getAverageHouseSize(){

        List<House> house = Utility.getHouse();
        double size = 0.0;

        for(House element : house){

            size += element.getSize();

        }

        return size / house.size();

    }

    public double getAverageVillaSize(){

        List<Villa> villa = Utility.getVilla();
        double size = 0.0;

        for(Villa element : villa){

            size += element.getSize();

        }

        return size / villa.size();


    }

    public double getAverageSummerySize(){

        List<Summery> summery = Utility.getSummery();
        double size = 0.0;

        for(Summery element : summery){

            size += element.getSize();

        }

        return size / summery.size();

    }

    public double getAverageTotalSize(){

        double size = getAverageHouseSize() + getAverageVillaSize() + getAverageSummerySize();

        return size / 9;

    }

    public void filter(int bedroom, int saloon){

        List<House> house = Utility.getHouse();
        List<Villa> villa = Utility.getVilla();
        List<Summery> summery = Utility.getSummery();

        int houseMatch = 0;
        int villaMatch = 0;
        int summeryMatch = 0;

        for(House element : house){

            if(element.getBedroom() == bedroom && element.getSaloon() == saloon){

                houseMatch++;
            }
        }

        for(Villa element : villa){

            if(element.getBedroom() == bedroom && element.getSaloon() == saloon){

                villaMatch++;
            }
        }

        for(Summery element : summery){

            if(element.getBedroom() == bedroom && element.getSaloon() == saloon){

                summeryMatch++;
            }
        }

        System.out.println("\nThere is " + houseMatch + " house match for " + bedroom + " bedroom and " + saloon + " saloon.");
        System.out.println("There is " + villaMatch + " villa match for " + bedroom + " bedroom and " + saloon + " saloon.");
        System.out.println("There is " + summeryMatch + " summery match for " + bedroom + " bedroom and " + saloon + " saloon.");



    }





}
