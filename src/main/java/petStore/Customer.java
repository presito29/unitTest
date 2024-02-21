package petStore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Animal> purchasedAnimals;

    public Customer(String name) {
        this.name = name;
        this.purchasedAnimals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Animal> getPurchasedAnimals() {
        return new ArrayList<>(purchasedAnimals);
    }

    public void purchaseAnimal(Animal animal) {
        purchasedAnimals.add(animal);
    }
}
