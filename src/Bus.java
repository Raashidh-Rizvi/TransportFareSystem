public class Bus extends Transport  {


    public Bus(String vehicleNumber, Double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);

    }

    public double calculateFare() {
        return 10 * (getDistanceTravelled()) + 50;
    }

}
