import java.util.*;

class Circle {
    double radius;
    void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
}

class Area extends Circle {
    double calculate() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("Area of the circle: " + calculate());
    }
}

class Volume extends Area {
    double calculateSphereVolume() {
        return (4.0 / 3.0) * 3.14 *radius*radius*radius;
    }
    void display() {
        System.out.println("Volume of the sphere: " + calculateSphereVolume());
    }
}

class Main{
    public static void main(String[] args) {
        Volume sphere = new Volume();
        sphere.acceptRadius(); //Takes input for radius from user
        sphere.display();     //Calculates and displays the volume of sphere 
    }
}
