package petStore;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PetStoreIntegrationTest {

    @Test
    public void testCustomerCanPurchaseAnimal() {
        PetStore petStore = new PetStore();
        Animal animal = new Animal("Dog", 20, 100.0);
        petStore.addAnimal(animal);

        Customer customer = new Customer("Alice");
        customer.purchaseAnimal(animal);

        assertTrue(customer.getPurchasedAnimals().contains(animal));
    }

    @Test
    public void testPetStoreTracksCustomerPurchases() {
        PetStore petStore = new PetStore();
        Animal animal = new Animal("Cat", 10, 50.0);
        petStore.addAnimal(animal);

        Customer customer = new Customer("Bob");
        customer.purchaseAnimal(animal);

        assertEquals(1, petStore.getCount());
    }

    @Test
    public void testPetStoreInventoryNotAffectedByCustomerPurchase() {
        PetStore petStore = new PetStore();
        Animal animal = new Animal("Parrot", 5, 150.0);
        petStore.addAnimal(animal);

        Customer customer = new Customer("Charlie");
        customer.purchaseAnimal(animal);

        assertEquals(1, petStore.getCount());
    }
}
