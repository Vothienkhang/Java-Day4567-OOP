package Duck;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swiming");
    }
}
