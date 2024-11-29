package pgdp.zoo;

public class Mammal extends Animal {

    private boolean isPregnant;
    public Mammal(String name, int age) {
        super(name, age);
    }

    public boolean isPregnant() {
        return isPregnant;
    }
}
