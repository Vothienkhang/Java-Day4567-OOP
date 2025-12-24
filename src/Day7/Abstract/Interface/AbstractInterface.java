package Day7.Abstract.Interface;

import Day7.Abstract.Interface.Animal;
import Day7.Abstract.Interface.Tiger;
import Day7.Abstract.Interface.Chicken;

public class AbstractInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
