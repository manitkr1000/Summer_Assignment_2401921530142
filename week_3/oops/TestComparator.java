import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// FirstClass class
class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment: Luxury travel.";
    }
}

// Ladies class
class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for ladies.";
    }
}

// General class
class General extends Compartment {
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}

// Luggage class
class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: For luggage only.";
    }
}

// Main class
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int num = rand.nextInt(4) + 1; // Random number 1 to 4

            switch (num) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Display notices (Polymorphism)
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}
