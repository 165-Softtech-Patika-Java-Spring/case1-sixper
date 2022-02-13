package src.Homie;

public class Home {

    protected double price;
    protected final int bedroom;
    protected final int saloon;
    protected final double size;

    public Home(double price, int bedroom, int saloon, double size) {
        this.price = price;
        this.bedroom = bedroom;
        this.saloon = saloon;
        this.size = size;
    }
}
