package Inheritance;
public class Car extends Vehicle {
    Car(String u) {
        super();
    }
}

class FamilyCar extends Car {
    FamilyCar(String s) {
        super(s);
    }

    void seats() {
        System.out.println("Can only take 4 people");
    }
}
class SportCar extends Car {
    SportCar(String s) {
        super(s);
    }

    void speed() {
        System.out.println("Too fast: 290");
    }
}

