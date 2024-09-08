// Base class: Animal
 class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
// Derived class: Dog (inherits from Animal)
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


  public class learnoverride {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Some generic animal sound

        // Create an instance of Dog
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Bark

        // Demonstrate polymorphism
        Animal myPolymorphicDog = new Dog();
        myPolymorphicDog.makeSound();  // Output: Bark
    }

    @Override
    public String toString() {
        return "learnoverride []";
    }
}

