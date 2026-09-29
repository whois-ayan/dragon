class Circle {
    double radius;
    Circle() {
        radius = 0;
    }
    Circle(double radius, double x) {
        this.radius = radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, 0);

        System.out.println("Circumference = " + c2.calculateCircumference());
    }
}
