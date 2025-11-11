import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PersonTest {
//    Person person1;
//    String person1Name = "Piet";
//    String person1LastName = "Pietersen";
//    String person1MiddleName = "van der";
//    BiologicalGender person1Gender = BiologicalGender.Male;
//    int person1Age = 34;
//    Person person2;
//    Person person3;
//
    @BeforeEach
    void SetInitialState() {
//        person1 = new Person(person1Name, person1MiddleName, person1LastName, person1Age, person1Gender);
//        person2 = new Person("Jade", "Pietersen", 22, BiologicalGender.Female);
//        person3 = new Person("James", "Pietersen", 3, BiologicalGender.Male);
    }

    // name getter & setter:
    @Test
    @DisplayName("Person name should not change during creation")
    void personNameShouldNotChange() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "James";

        //Act:
        String name = dummyPerson.getName();

        // assert:
        assertEquals(expectedResult, name);
    }

    @Test
    @DisplayName("Person name should not change when setting")
    void personNameShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyPerson = new Person("James", "Mitch", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "Michael";

        //Act:
        dummyPerson.setName("Michael");
        String newName = dummyPerson.getName();

        // assert:
        assertEquals(expectedResult, newName);
    }

    // middleName getter & setter:
    @Test
    @DisplayName("Person middle name should not change during creation")
    void personMiddleNameShouldNotChange() {
        // Arrange:
        Person dummyPerson = new Person("James", "007", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "007";

        //Act:
        String middleName = dummyPerson.getMiddleName();

        // assert:
        assertEquals(expectedResult, middleName);
    }

    @Test
    @DisplayName("Person middle name should not change when setting")
    void personMiddleNameShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyPerson = new Person("James", "Mitch", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "Hans";

        //Act:
        dummyPerson.setMiddleName("Hans");
        String newMiddleName = dummyPerson.getMiddleName();

        // assert:
        assertEquals(expectedResult, newMiddleName);
    }

    // lastName getter & setter:
    @Test
    @DisplayName("Person last name should not change during creation")
    void personLastNameShouldNotChange() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "Bond";

        //Act:
        String lastName = dummyPerson.getLastName();

        // assert:
        assertEquals(expectedResult, lastName);
    }

    @Test
    @DisplayName("Person last name should not change when setting")
    void personLastNameShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyPerson = new Person("James", "Mitch", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "Janssen";

        //Act:
        dummyPerson.setLastName("Janssen");
        String newLastName = dummyPerson.getLastName();

        // assert:
        assertEquals(expectedResult, newLastName);
    }

    // sex getter & setter:
    @Test
    @DisplayName("Person sex should not change during creation")
    void personSexShouldNotChange() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person.Sex expectedResult = Person.Sex.MALE;

        //Act:
        Person.Sex sex = dummyPerson.getSex();

        // assert:
        assertEquals(expectedResult, sex);
    }

    @Test
    @DisplayName("Person sex should not change when setting")
    void personSexShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person.Sex expectedResult = Person.Sex.FEMALE;

        //Act:
        dummyPerson.setSex(Person.Sex.FEMALE);
        Person.Sex newSex = dummyPerson.getSex();

        // assert:
        assertEquals(expectedResult, newSex);
    }

    // age getter & setter:
    @Test
    @DisplayName("Person age should not change during creation")
    void personAgeShouldNotChange() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        int expectedResult = 45;

        //Act:
        int age = dummyPerson.getAge();

        // assert:
        assertEquals(expectedResult, age);
    }

    @Test
    @DisplayName("Person age should not change when setting")
    void personAgeShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        int expectedResult = 25;

        //Act:
        dummyPerson.setAge(25);
        int newAge = dummyPerson.getAge();

        // assert:
        assertEquals(expectedResult, newAge);
    }

    // mother getter & setter:
    @Test
    @DisplayName("Adding a mother should set mother")
    void personMotherShouldNotChange() {
        // Arrange:
        Person dummyMother = new Person("Maria", "Bond", 45, Person.Sex.FEMALE);
        Person dummyChild = new Person("Harrold", "Bond", 4, Person.Sex.MALE);

        //Act:
        dummyChild.setMother(dummyMother);
        Person mother = dummyChild.getMother();

        // assert:
        assertSame(dummyMother, mother);
    }

    // father getter & setter:
    @Test
    @DisplayName("Adding a father should set father")
    void personFatherShouldNotChange() {
        // Arrange:
        Person dummyFather = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person dummyChild = new Person("Harrold", "Bond", 4, Person.Sex.MALE);

        //Act:
        dummyChild.setFather(dummyFather);
        Person father = dummyChild.getFather();

        // assert:
        assertSame(dummyFather, father);
    }

    // Pet getter & setter:
    @Test
    @DisplayName("Adding a pet should give pet")
    void petShouldNotChange() {
        // Arrange:
        Person dummyFather = new Person("James", "Bond", 45, Person.Sex.MALE);
        Pet dummyPet = new Pet("Zeus", 5, "cat");

        //Act:
        dummyFather.addPet(dummyPet);

        // assert:
        assertSame(dummyPet, dummyFather.getPets().getFirst());
        assertSame(dummyFather, dummyPet.getOwner());
    }

    @Test
    @DisplayName("Setting a pet should set pet")
    void petShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyFather = new Person("James", "Bond", 45, Person.Sex.MALE);
        Pet dummyPet = new Pet("Zeus", 5, "cat");
        ArrayList<Pet> newPets = new ArrayList<>();

        //Act:
        dummyFather.setPets(newPets);
        ArrayList<Pet> petsOfDad = dummyFather.getPets();

        // assert:
        assertSame(newPets, petsOfDad);
    }

    // Sibling getter & setter:
    @Test
    @DisplayName("Adding a sibling should give sibling")
    void siblingShouldNotChange() {
        // Arrange:
        Person dummyFather = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person dummyUncle = new Person("Mike", "Bond", 40, Person.Sex.MALE);

        //Act:
        dummyFather.addSibling(dummyUncle);
        dummyUncle.addSibling(dummyFather);

        // assert:
        assertSame(dummyUncle, dummyFather.getSiblings().getFirst());
        assertSame(dummyFather, dummyUncle.getSiblings().getFirst());
    }

    @Test
    @DisplayName("Setting a sibling should set sibling")
    void siblingShouldNotChangeAtSetting() {
        // Arrange:
        Person dummyFather = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person dummyUncle = new Person("Mike", "Bond", 40, Person.Sex.MALE);
        ArrayList<Person> newSiblings = new ArrayList<>();

        //Act:
        dummyFather.setSiblings(newSiblings);
        ArrayList<Person> siblingOfDad = dummyFather.getSiblings();

        // assert:
        assertSame(newSiblings, siblingOfDad);
    }

    //addParents methode:
    @Test
    @DisplayName("Adding a parents should give parent")
    void addingParentShouldNotChange() {
        //Arrange:
        Person dummyMother = new Person("Maria", "Bond", 45, Person.Sex.FEMALE);
        Person dummyDad = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person dummyChild = new Person("Harrold", "Bond", 4, Person.Sex.MALE);

        //Act:
        dummyChild.addParents(dummyMother, dummyDad);
        Person dadOfChild = dummyChild.getFather();
        Person momOfChild = dummyChild.getMother();

        //Assert:
        assertEquals(dummyMother, momOfChild);
        assertEquals(dummyDad, dadOfChild);

    }


    //addPet methode:
    // UNFINISHED

    //addSibling methode:
    // UNFINISHED

    //getGrandChildren methode:
    // UNFINISHED

    // addChild methode:
    @Test
    @DisplayName("Adding a child should give child and also add the child to parents")
    void personChildShouldNotChange() {
        // Arrange:
        Person dummyMother = new Person("Maria", "Bond", 45, Person.Sex.FEMALE);
        Person dummyDad = new Person("James", "Bond", 45, Person.Sex.MALE);
        Person dummyChild = new Person("Harrold", "Bond", 4, Person.Sex.MALE);
        Person dummyChild2 = new Person("Lilly", "Mills", 14, Person.Sex.FEMALE);
        ArrayList<Person> childrenOfMom = new ArrayList<>();

        //Act:
        dummyMother.addChild(dummyChild);
        dummyDad.addChild(dummyChild);
        Person childOfMom = dummyMother.getChildren().getFirst();
        Person childOfDad = dummyDad.getChildren().getFirst();
        Person motherOfSecondChild = dummyChild2.getMother();
        Person fatherOfSecondChild = dummyChild2.getFather();
        childrenOfMom.add(dummyChild);
        dummyMother.setChildren(childrenOfMom);

        // assert:
        assertSame(dummyChild, childOfMom);
        assertSame(dummyMother, childOfMom.getMother());
        assertSame(dummyChild, childOfDad);
        assertSame(dummyDad, childOfDad.getFather());
        assertNull(motherOfSecondChild);
        assertNull(fatherOfSecondChild);
        assertSame(dummyChild, childrenOfMom.getFirst());
    }

}