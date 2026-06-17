public class ColdBox extends StorageUnit implements Refrigerated {

    int currentTemp;


    public ColdBox(int id, double capacity) {
        super(id, capacity);
        this.currentTemp = 18;
    }

    // implemented refrigerated  adjustTemp
    @Override
    public void adjustTemp(int t) {
        this.currentTemp = t;
        System.out.println("ColdBox #" + id + " temperature is now set to " + t + " degrees.");
    }
}