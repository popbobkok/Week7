public class Dog extends PetData {
    String bodySize, hairSize;

    public Dog(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Run() {
        System.out.println("My dog " + name + " is run to the jungle");
    }

    public void Bark() {
        System.out.print(" Box Box!! ");
    }

    public void isShortHair() {
        System.out.println("Size : " + bodySize);

        String way;

        if (hairSize.equals("Short hair")) {
            way = "True";
        } else {
            way = "False";
        }

        System.out.println(" Short hair : " + way);

    }

}
