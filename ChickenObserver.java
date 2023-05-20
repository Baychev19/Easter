public class ChickenObserver implements Observer {
    public void update(int count) {
        if (count > 5) {
            System.out.println("Eggs are ready!");
        }
    }
}
