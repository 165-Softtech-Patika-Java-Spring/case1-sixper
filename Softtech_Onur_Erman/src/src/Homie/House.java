package src.Homie;

public class House extends Home{

    public House(double price, int bedroom, int saloon, double size) {
        super(price, bedroom, saloon, size);
    }

    public double getPrice(){

        return this.price;

    }

    public double getSize(){

        return this.size;

    }

    public int getBedroom(){

        return this.bedroom;

    }

    public int getSaloon(){

        return this.saloon;

    }



}
