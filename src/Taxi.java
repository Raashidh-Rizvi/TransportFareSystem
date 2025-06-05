

public class Taxi extends Transport {

    public Taxi(String vehicleNumber, Double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    public double calculateFare() {
        return 20 * getDistanceTravelled();
    }


}
