import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

//Tests
public class PetTest {

    // Name getter & setter:
    @Test
    @DisplayName("Pet name should change during the creation")
    void petNameShouldNotChange() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        String expectedResult = "Lassie";

        //Act:
        String name = dummyPet.getName();

        // assert:
        assertEquals(expectedResult, name);
    }

    @Test
    @DisplayName("Pet name should not change during setting")
    void petNameShouldNotChangeAtSetting() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
       String expectedName = "Kingboy";

        //Act:
        dummyPet.setName("Kingboy");
        String newName = dummyPet.getName();

        // assert:
        assertEquals(expectedName, newName);
    }

    // Age getter & setter:
    @Test
    @DisplayName("Pet age should not change during creation")
    void petAgeShouldNotChange() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        int expectedAge = 7;

        //Act:
        int age = dummyPet.getAge();

        // assert:
        assertEquals(expectedAge, age);
    }

    @Test
    @DisplayName("Pet age should not be changed during setting")
    void petAgeShouldNotChangeAtSetting() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        int expectedAge = 10;

        //Act:
        dummyPet.setAge(10);
        int newAge = dummyPet.getAge();

        // assert:
        assertEquals(expectedAge, newAge);
    }

    // Species getter & setter:
    @Test
    @DisplayName("Pet species should change during the creation")
    void petSpeciesShouldNotChange() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        String expectedSpecies = "dog";

        //Act:
        String species = dummyPet.getSpecies();

        // assert:
        assertEquals(expectedSpecies, species);
    }

    @Test
    @DisplayName("Pet species should not be changed during setting")
    void petSpeciesShouldNotChangeAtSetting() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        String expectedSpecies = "cat";

        //Act:
        dummyPet.setSpecies("cat");
        String newSpecies = dummyPet.getSpecies();

        // assert:
        assertEquals(expectedSpecies, newSpecies);
    }

    // Owner getter & setter:
    @Test
    @DisplayName("Pet owner should not be changed during setting")
    void petOwnerShouldNotChangeAtSetting() {
        // Arrange:
        Pet dummyPet = new Pet("Lassie", 7, "dog");
        Person expectedOwner = new Person("Harry", "Jim", 40, Person.Sex.MALE);

        //Act:
        dummyPet.setOwner(expectedOwner);
        Person owner = dummyPet.getOwner();

        // assert:
        assertEquals(expectedOwner, owner);
    }

    // HELP VAN CHATGPT VOOR DE HIERONDERSTAANDE TEST OM VAN TE LEREN
    // @override toString() test:
    @Test
    void toString_toontNone_alsOwnerNullIs() {
        // Arrange
        Pet pet = new Pet("Lassie", 7, "dog");

        // Act
        String out = pet.toString();

        // Assert
        assertEquals("Pet{name='Lassie', species='dog', age=7, owner=<none>}", out);
    }

    @Test
    void toString_toontOwnerNaam_alsOwnerAanwezigIs() {
        // Arrange
        Pet pet = new Pet("Bonzo", 2, "dog");
        Person owner = new Person("Harry", "Jim", 40, Person.Sex.MALE);
        owner.addPet(pet);

        // Act
        String out = pet.toString();

        // Assert
        assertEquals("Pet{name='Bonzo', species='dog', age=2, owner=Harry}", out);
    }
}
