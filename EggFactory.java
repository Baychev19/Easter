public class EggFactory {
    public Egg createEgg(String type) {
        if (type.equalsIgnoreCase("pudpud")) {
            return new PudPudEgg();
        } else if (type.equalsIgnoreCase("chicken")) {
            return new ChickenEgg();
        } else if (type.equalsIgnoreCase("dinosaur")) {
            return new DinosaurEgg();
        } else {
            throw new IllegalArgumentException("Invalid egg type");
        }
    }
}
