public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", 3, DogEnums.Color.BLACK, DogEnums.Size.SMALL);
        Dog spot = new Dog("Spot", 2, DogEnums.Color.WHITE, DogEnums.Size.MEDIUM);
        Dog wolf = new Dog("Wolf", DogEnums.Color.BROWN);

        System.out.println("Snoopy: " + snoopy.getName() + ", Color: " + snoopy.getColor() + ", Age: " + snoopy.getAge() + ", Size: " + snoopy.getSize());
        System.out.println("Spot: " + spot.getName() + ", Color: " + spot.getColor() + ", Age: " + spot.getAge() + ", Size: " + spot.getSize());
        System.out.println("Wolf: " + wolf.getName() + ", Color: " + wolf.getColor() + ", Age: " + wolf.getAge() + ", Size: " + wolf.getSize());
        snoopy.bark();
        spot.bark();
        wolf.bark();
        snoopy.run();
        spot.run();
        wolf.run();
    }
}
