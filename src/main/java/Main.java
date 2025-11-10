public class Main {
    static void main() {

    Person motherOne = new Person ("Julia", "Smith", 45, Person.Sex.FEMALE);
    Person fatherOne = new Person ("Jim", "Handsen", 50, Person.Sex.MALE);
    Person childOne = new Person("David", "Backhem", 20, Person.Sex.MALE);
    childOne.addParents(motherOne, fatherOne);





    }
}
