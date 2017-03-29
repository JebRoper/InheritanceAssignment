/**
 * Created by admin on 3/29/17.
 */
public abstract class Vehicle {
    private String brand;
    private String year;

    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public String getAlarmNoise(){
        return "beep";
    }

    public abstract int getTopSpeed();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}



