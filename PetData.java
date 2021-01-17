public class PetData {
    String name, species, color;
    int age;
    String bodySize, hairSize; // for Dog
    String water, speed;// for Fish
    String CanFly, Country; // for Bird

    public PetData() {

    }

    public PetData(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void ShowPetData() {
        System.out.println("\nName: " + name + " && Species: " + species + " && Color: " + color + " && Age: " + age);

    }

}
