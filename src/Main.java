
public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("BBJ",10.0);
        bus.displayDetails();

        System.out.println();

        Taxi taxi = new Taxi("BCF",20.0);
        taxi.displayDetails();

    }
}