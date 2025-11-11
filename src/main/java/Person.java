import java.util.ArrayList;

public class Person {

    // attributes:
    private String name;
    private String middleName;
    private String lastName;
    private Sex sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> children = new ArrayList<>();
    private ArrayList<Person> siblings = new ArrayList<>();
    private ArrayList<Pet> pets = new ArrayList<>();

    // constructors:
    public Person(String name, String lastName, int age, Sex sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

    }

    public Person(String name, String middleName, String lastName, int age, Sex sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
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
        if (mother != null && mother == father) {
            throw new IllegalArgumentException("Mother and father cannot be the same person");
        }

        if (mother != null && mother != this) {
            mother.addChild(this);
        }

        if (father != null && father != this) {
            father.addChild(this);
        }
    }

    public void addChild(Person child) {
        if (child == null || child == this) {
            return;
        }

        if (!this.children.contains(child)) {
            this.children.add(child);
        }

        switch (this.sex) {
            case MALE:
                if (child.father == null) {
                    child.father = this;
                }
                break;

            case FEMALE:
                if (child.mother == null) {
                    child.mother = this;
                }
                break;

            default:
                if (child.mother == null) {
                    child.mother = this;
                } else if (child.father == null) {
                    child.father = this;
                }
                break;
        }
    }

    public void addPet(Pet pet) {
        if (pet == null) {
            return;
        }

        if (pet.getOwner() != null && pet.getOwner() != this) {
            throw new IllegalStateException("Pet already owned by someone else");
        }

        if (!this.pets.contains(pet)) {
            this.pets.add(pet);
        }

        if (pet.getOwner() == null) {
            pet.setOwner(this);
        }
    }

    public void addSibling(Person sibling) {
        if (sibling == null) {
            throw new NullPointerException("Cannot be left empty");
        }

        if (sibling == this) {
            throw new IllegalArgumentException("Itself cannot be sibling");
        }

        if (sibling == this.mother || sibling == this.father) {
            throw new IllegalArgumentException("A parent cannot be a sibling");
        }

        if (this.children.contains(sibling) || sibling.children.contains(this)) {
            throw new IllegalArgumentException("A child cannot be a sibling");
        }

        if (!this.siblings.contains(sibling)) {
            this.siblings.add(sibling);
        }
        if (!sibling.siblings.contains(this)) {
            sibling.siblings.add(this);
        }
    }

    public ArrayList<Person> getGrandChildren() {
        ArrayList<Person> grandChildren = new ArrayList<>();
        for (Person child : this.getChildren()) {
            grandChildren.addAll(child.getChildren());
        }
        return grandChildren;
    }

    // enum:
    public enum Sex {
      FEMALE, MALE
    }

    // toString() changing for readability in the terminal:
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                (middleName != null ? ", middleName='" + middleName + '\'' : "") +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", mother=" + (mother != null ? mother.getName() : "<none>") +
                ", father=" + (father != null ? father.getName() : "<none>") +
                ", childrenCount=" + (children != null ? children.size() : 0) +
                ", siblingsCount=" + (siblings != null ? siblings.size() : 0) +
                ", petsCount=" + (pets != null ? pets.size() : 0) +
                '}';
    }
}
