package pgdp.zoo;

public class Bird extends Animal {
    private boolean canFly;
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying to PUM!");
        } else {
            System.out.println(name + " is staying home...");
        }
    }

    public boolean canFly() {
        return canFly;
    }
}
