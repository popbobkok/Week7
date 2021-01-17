public class Bird extends PetData {

    String CanSpeak, CanFly, Country;

    public Bird(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Speak() {

        System.out.println(species + CanSpeak);

    }

    public void CheckCountry() {
        System.out.println("Many " + species + " at " + Country);
    }

    public void IsCanFly() {
        String way;

        if (CanFly.equals("can")) {
            way = "Yes!!";
        } else {
            way = "No..";
        }

        System.out.println(name + "is can Fly ?" + "\n : " + way);

    }
}
