public class Hovercraft implements SeaVessel, LandVehicle{
    private int numWheels;
    private String name;
    private int displacement;
    private int maxPassengers;
    private int maxSpeed;

    Hovercraft(){};

    public Hovercraft(int numWheels, String name, int displacement, int maxPassengers, int maxSpeed) {
        this.numWheels = numWheels;
        this.name = name;
        this.displacement = displacement;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
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
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Initiating launch");
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
        return this.maxPassengers;
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

    public void enterLand() {
        System.out.println("Land mode");
    }

    public void enterSea() {
        System.out.println("Sea mode");
    }
}