public class PoliceCar implements LandVehicle, IsEmergency {
    private int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int spareTires;

    public PoliceCar(){};

    public PoliceCar(int numWheels, String name, int maxPassengers, int maxSpeed, int sparetires) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.spareTires = sparetires;
    }

    @Override
    public String soundSiren() {
        return "Siren activated";
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int wheels) {
        this.numWheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Initiating drive");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int pass) {
        this.maxPassengers = pass;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public int checkTires() {
        return spareTires;
    }
}