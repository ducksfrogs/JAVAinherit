public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "hhh", 400);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Wolf");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String spped) {
        super.move(spped);
            System.out.println("Dogs walk, run and wag their tail");
        if(spped == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark () {
        System.out.println("Woof!");
    }

    private void run () {
        System.out.println("run!");
    }

    private void walk () {
        System.out.println("walk!");
    }

    private void wagTail () {
        System.out.println("wagTail!");
    }

}
