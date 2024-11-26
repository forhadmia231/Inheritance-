package inheritance;
public class inheritance {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.name = "Buddy";
        dog.eat();   // Inherited method
        dog.bark();  // Method from Dog class
    }
}

