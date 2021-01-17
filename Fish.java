
public class Fish extends PetData {
    String bodySize, water, speed;

    public Fish(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void SwimToSea() {
        String way;

        if (water.equals("Salt water")) {
            way = "true";
        } else {
            way = "false";
        }
        System.out.println("My fish " + name + " is swim to the sea." + "\nSize : " + bodySize + " and can live in "
                + water + " (" + way + ").");

    }

    public void SwimFast() {
        System.out.println(name + " is swim to " + speed);
    }
}