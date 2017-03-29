public class Main {

    public static void main(String[] args) {

        Pickups pickup = new Pickups("Ford","2005", 3500,"4door");
        System.out.println(pickup);
        System.out.println("Top speed is " + pickup.getTopSpeed());
        System.out.println("The alarm sound is " + pickup.getAlarmNoise());
    }

}
