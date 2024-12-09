package tumobile;

public class Car {

    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel rearLeftWheel;
    private Wheel rearRightWheel;

    private Engine engine;
    private Fueltank fueltank;

    public Car(Wheel frontLeftWheel, Wheel frontRightWheel, Wheel rearLeftWheel, Wheel rearRightWheel, Engine engine, Fueltank fueltank){
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rearLeftWheel = rearLeftWheel;
        this.rearRightWheel = rearRightWheel;

        this.engine = engine;
        this.fueltank = fueltank;

    }

    public Wheel getRearLeftWheel() {
        return rearLeftWheel;
    }

    public Wheel getRearRightWheel() {
        return rearRightWheel;
    }

    public Wheel getFrontRightWheel() {
        return frontRightWheel;
    }

    public Wheel getFrontLeftWheel() {
        return frontLeftWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Fueltank getFueltank() {
        return fueltank;
    }

    public double getRange(){
        return fueltank.getFuelLevel() / engine.getConsumption() * 100;
    }

    public double getMaxRange(){
        return fueltank.getCapacity() / engine.getConsumption() * 100;
    }












    /*private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel rearLeftWheel;
    private Wheel rearRightWheel;

    private Engine engine;
    private Fueltank fueltank;

    public Car(Engine engine, Fueltank fueltank, Wheel frontLeftWheel, Wheel frontRightWheel, Wheel rearLeftWheel, Wheel rearRightWheel){
        this.engine = engine;
        this.fueltank = fueltank;
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rearLeftWheel = rearLeftWheel;
        this.rearRightWheel = rearRightWheel;
    }

    public Engine getEngine() {
        return engine;
    }
    public Fueltank getFueltank() {
        return fueltank;
    }
    public Wheel getFrontLeftWheel() {
        return frontLeftWheel;
    }
    public Wheel getFrontRightWheel() {
        return frontRightWheel;
    }
    public Wheel getRearLeftWheel() {
        return rearLeftWheel;
    }
    public Wheel getRearRightWheel() {
        return rearRightWheel;
    }

    public double getRange(){
        return fueltank.getFuelLevel() / engine.getConsumption() * 100;
    }

    public double getMaxRange() {
        return fueltank.getCapacity() / engine.getConsumption() * 100;
    }*/
}
 /*private Engine engine;
    private Fueltank fueltank;
    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel rearLeftWheel;
    private Wheel rearRightWheel;

    public Car(Engine engine, Fueltank fueltank, Wheel frontLeftWheel, Wheel frontRightWheel, Wheel rearLeftWheel, Wheel rearRightWheel) {
        this.engine = engine;
        this.fueltank = fueltank;
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rearLeftWheel = rearLeftWheel;
        this.rearRightWheel = rearRightWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Fueltank getFueltank() {
        return fueltank;
    }

    public Wheel getFrontLeftWheel() {
        return frontLeftWheel;
    }

    public Wheel getFrontRightWheel() {
        return frontRightWheel;
    }

    public Wheel getRearLeftWheel() {
        return rearLeftWheel;
    }

    public Wheel getRearRightWheel() {
        return rearRightWheel;
    }

    public double getRange() {
        return fueltank.getFuelLevel() / engine.getConsumption() * 100;
    }

    public double getMaxRange() {
        return fueltank.getCapacity() / engine.getConsumption() * 100;
    }*/