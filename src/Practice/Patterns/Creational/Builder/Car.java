package Practice.Patterns.Creational.Builder;

public class Car extends CarBuilder{
    private int number;
    private String engine;
    private String tripComputer;
    private String gps;

    public Car(int number, String engine, String tripComputer, String gps) {
        this.number = number;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public int getNumber() {
        return number;
    }

    public String getEngine() {
        return engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
