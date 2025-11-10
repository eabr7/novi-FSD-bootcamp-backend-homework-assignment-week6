import java.util.ArrayList;

public class Person {

    // attributes:
    private String name;
    private String middleName;
    private String lastName;
    private Sex sex;
    private int age;
    Person mother;
    Person father;
    ArrayList<Person> siblings;
    ArrayList<Person> children;
    ArrayList<Pet> pets;

    // constructors:
    public Person (String name, String lastName, int age, Sex sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        ArrayList<Person> parents = new ArrayList<>();

    }

    public Person (String name, String middleName, String lastName, int age, Sex sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        ArrayList<Person> parents = new ArrayList<>();
    }

    // getters:
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    // setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    // methods:
    public void addParents(Person mother, Person father) {
        if (mother != null) {
            this.mother = mother;
        }

        if (father != null) {
        this.father = father;
        }
    }

    public void addChild() {

    }

    public void addPet() {

    }

    public void addSibling() {

    }

    public void getGrandChildren () {

    }

    // enum:
    public enum Sex {
        FEMALE, MALE
    }


}
