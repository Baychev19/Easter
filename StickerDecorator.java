public class StickerDecorator extends EggDecorator {
    private Egg egg;

    public StickerDecorator(Egg egg) {
        this.egg = egg;
    }

    public String getDescription() {
        return egg.getDescription() + ", with stickers";
    }

    public void decorate() {
        egg.decorate();
        System.out.println("Adding stickers to egg");
    }
}
