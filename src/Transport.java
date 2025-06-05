public abstract class Transport {
    private String vehicleNumber;
    private Double distanceTravelled;


    public Transport(){
        this.vehicleNumber=getVehicleNumber();
        this.distanceTravelled=getDistanceTravelled();
    }


    public Transport(String vehicleNumber, Double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }


    public abstract double calculateFare();

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled);
        System.out.println("Fare: " + calculateFare());

    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
