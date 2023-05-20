public class ColorDecorator extends EggDecorator {
    private Egg egg;

    public ColorDecorator(Egg egg) {
        this.egg = egg;
    }

    public String getDescription() {
        return egg.getDescription() + ", with color";
    }

    public void decorate() {
        egg.decorate();
        System.out.println("Adding color to egg");
    }
}
