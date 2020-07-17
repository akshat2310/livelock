public class commonresource {
    private worker owner;

    public commonresource (worker d) {
        owner = d;
    }

    public worker getOwner () {
        return owner;
    }

    public synchronized void setOwner (worker d) {
        owner = d;
    }
}
