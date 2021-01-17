public class Lab8_PETS {
    public static void main(String[] args) {

        Dog d1 = new Dog("Sugar", "Pooddle", "White", 2);
        Fish f1 = new Fish("Neemo", "Cartoon", "Orange and White", 1);
        Bird b1 = new Bird("Coco", "Parrot", "Green", 3);

        d1.bodySize = "Small";
        d1.hairSize = "Short hair";
        d1.ShowPetData();
        d1.Run();
        d1.Bark();
        d1.isShortHair();

        f1.speed = "Slow";
        f1.bodySize = "Small";
        f1.water = "Salt water";
        f1.ShowPetData();
        f1.SwimToSea();
        f1.SwimFast();

        b1.CanFly = "can";
        b1.CanSpeak = " can speak";
        b1.Country = "Australia";
        b1.ShowPetData();
        b1.Speak();
        b1.CheckCountry();
        b1.IsCanFly();
    }
}
