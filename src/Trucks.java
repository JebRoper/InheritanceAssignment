/**
 * Created by admin on 3/29/17.
 */
public abstract class Trucks extends Vehicle {
  private int payload;

    public Trucks(String brand, String year, int payload) {
        super(brand, year);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "payload=" + payload +
                '}' + super.toString();
    }
}



