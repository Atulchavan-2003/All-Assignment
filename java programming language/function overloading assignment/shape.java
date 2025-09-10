class Shape {
    // Rectangle area (length, breadth)

    double area(double length, double breadth) {
        return length * breadth;
    }

    // Triangle area (base, height)

    double area(int base,int height) {
        return  (base * height)/2;
    }

    // Circle area (radius)

    double area(int radius) {
        return 3.14 * radius * radius; 
    }
}
class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
         double a=10,b=5;
         int base = 8,h=6,radius=7;
         
        System.out.println("Rectangle Area: " + s.area(a, b));
        System.out.println("Triangle Area: " + s.area(base, h));
        System.out.println("Circle Area: " + s.area(radius));
    }
}
