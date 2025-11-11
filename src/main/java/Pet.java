public class Pet {

    // attributes:
    private String name;
    private int age;
    private String species;
    private Person owner;

    //constructor:
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //getters:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getOwner() {
        return owner;
    }

    //setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // toString() changing for readability in the terminal:
    @Override
    public String toString() {
        String ownerName = (owner != null) ? owner.getName() : "<none>";
        return "Pet{" +
                "name='" + name + "', species='" + species + "', age=" + age +
                ", owner=" + ownerName + '}';
    }
}


