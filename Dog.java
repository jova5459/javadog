public class Dog {
    private String name;
    private int age;
    private DogEnums.Color color;
    private DogEnums.Size size;
    public void bark() {
        System.out.println(name + " is barking!");
    }
    public void run() {
        System.out.println(name + " is running!");
    }


    // Constructors
    public Dog(String name, int age, DogEnums.Color color, DogEnums.Size size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    public Dog(String name, int age, DogEnums.Color color) {
        this(name, age, color, DogEnums.Size.MEDIUM);
    }

    public Dog(String name, DogEnums.Color color) {
        this(name, 1, color, DogEnums.Size.MEDIUM);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DogEnums.Color getColor() {
        return color;
    }

    public DogEnums.Size getSize() {
        return size;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(DogEnums.Color color) {
        this.color = color;
    }

    public void setSize(DogEnums.Size size) {
        this.size = size;
    }
}


