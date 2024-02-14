
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zoo.entities.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class PetStoreTests {

    PetStore store;
    List<Animal> animaslList;

    @Before
    public void setup(){
        this.animaslList = new ArrayList<>();
        this.store = new PetStore();
    }


    @Test (expected = IllegalArgumentException.class)
    public void testAddAnimalError(){
        PetStore store = new PetStore();
        this.store.addAnimal(null);
    }

    @Test
    public void testAddAnimal(){
        PetStore petStore = new PetStore();
        Animal animal = new Animal("sheep", 15, 100.63);
        this.store.addAnimal(animal);
        Assert.assertEquals(0, store.getCount());
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetAnimals(){
        this.store.getAnimals().clear();
    }

    @Test
    public void testFindAllAnimalsWithMaxKg(){
        PetStore store = new PetStore();
        this.animaslList = new ArrayList<>();
        Animal animal = new Animal("sheep", 15, 100.63);
        Animal animal2 = new Animal("wolf", 113, 900.17);

        animaslList.add(animal);
        animaslList.add(animal2);


        store.addAnimal(animal);
        store.addAnimal(animal2);


        Assert.assertEquals(1, store.findAllAnimalsWithMaxKilograms(100).size());
    }

    @Test
    public void testFindAllAnimalBySpecies(){
        PetStore store1 = new PetStore();
        this.animaslList = new ArrayList<>();
        Animal animal = new Animal("sheep", 15, 100.63);
        Animal animal2 = new Animal("wolf", 113, 900.17);

        animaslList.add(animal);
        animaslList.add(animal2);

        store1.addAnimal(animal);
        store1.addAnimal(animal2);


        Assert.assertEquals(1, store1.findAllAnimalBySpecie("wolf").size());
    }

    @Test
    public void testGetMostExpensiveAnimal(){
        PetStore petStore = new PetStore();
        this.animaslList = new ArrayList<>();
        Animal animal = new Animal("sheep", 15, 100.63);
        Animal animal2 = new Animal("wolf", 113, 900.17);


        petStore.addAnimal(animal);
        petStore.addAnimal(animal2);


        Assert.assertEquals(animal2, petStore.getTheMostExpensiveAnimal());
    }



}


