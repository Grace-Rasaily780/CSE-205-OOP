public class ColdBox extends StorageUnit implements Refrigerated {
    int id;
    double capacity;

    ColdBox(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void adjustTemp(int t) {
        System.out.println("The temp is adjusted to " + t);
        System.out.println("id: " + this.id);
    }
}
