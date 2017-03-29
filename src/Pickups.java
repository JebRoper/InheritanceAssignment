/**
 * Created by admin on 3/29/17.
 */
public class Pickups extends Trucks {
    private String cabSize;

    public Pickups(String brand, String year, int payload, String cabSize) {
        super(brand, year, payload);
        this.cabSize = cabSize;
    }

    @Override
    public String getAlarmNoise() {
        return "LOUD!";
    }

    public String getCabSize() {
        return cabSize;
    }

    @Override
    public int getTopSpeed() {
        return 140;
    }

    @Override
    public String toString() {
        return "Pickups{" +
                "cabSize='" + cabSize + '\'' +
                '}' + super.toString();


    }
}


