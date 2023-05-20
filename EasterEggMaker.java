public class EasterEggMaker {
    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();
        Egg egg1 = bunny.createEgg("pudpud");
        egg1 = new StickerDecorator(egg1);
        Egg egg2 = bunny.createEgg("chicken");
        egg2 = new ColorDecorator(egg2);
        Egg egg3 = bunny.createEgg("dinosaur");
        egg3 = new StickerDecorator(new ColorDecorator(egg3));

        Basket basket = new Basket();
        basket.addObserver(new ChickenObserver());
        basket.addEgg(egg1);
        basket.addEgg(egg2);
        basket.addEgg(egg3);
    }
}

