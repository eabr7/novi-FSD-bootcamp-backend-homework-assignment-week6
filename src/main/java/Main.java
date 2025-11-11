public class Main {
    static void main() {

    Person motherOne = new Person ("Julia", "Smith", 45, Person.Sex.FEMALE);
    Person fatherOne = new Person ("Jim", "Backhem", 50, Person.Sex.MALE);
    Person childOne = new Person("David", "Backhem", 20, Person.Sex.MALE);
    Person childTwo = new Person("Monique", "Beckham", 30, Person.Sex.FEMALE);
    Person grandChild1 = new Person("Milly", "Mills", 10, Person.Sex.FEMALE);
    Pet pet1 = new Pet("Pluis", 5, "cat");
    childOne.addParents(motherOne, fatherOne);
    childOne.addPet(pet1);
    System.out.println(childOne.getPets());
    System.out.println(pet1.getOwner());
    childOne.addChild(grandChild1);
    System.out.println(motherOne.getChildren());
    System.out.println(motherOne.getGrandChildren());
    childOne.addSibling(childTwo);
    fatherOne.addChild(childTwo);
    motherOne.addChild(childTwo);
    System.out.println(fatherOne.getChildren());
    System.out.println(motherOne.getChildren());
    System.out.println(childTwo.getSiblings());
    System.out.println(childOne.getSiblings());
    }
}
