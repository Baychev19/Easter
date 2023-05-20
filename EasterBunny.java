public class EasterBunny {
    private static EasterBunny instance = null;

    private EasterBunny() {
        // private constructor
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public Egg createEgg(String type) {
        EggFactory eggFactory = new EggFactory();
        Egg egg = eggFactory.createEgg(type);
        egg.decorate();
        return egg;
    }
}
