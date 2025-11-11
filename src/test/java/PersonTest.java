import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class PersonTest {


//    @Test
//    @DisplayName("XXXXXXXXXXXXX")
//    void nameNotChangedAtCreation() {
//        //Arrange:
//        Person person = new Person("Jan");
//        String expectedResult = "Jan";
//
//        //Act:
//        String actual = person.getName();
//
//        //Assert:
//        assertEquals(expectedResult, actual);

    @Test
    @DisplayName("Person name should not be changed during the creation of an Pet instance")
    void personNameShouldNotBeChanged() {
        // Arrange:
        Person dummyPerson = new Person("James", "Bond", 45, Person.Sex.MALE);
        String expectedResult = "James";

        //Act:
        String name = dummyPerson.getName();

        // assert:
        assertEquals(expectedResult, name);
    }

}
