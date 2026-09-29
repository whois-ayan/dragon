class Distance {
    int feet;
    int inches;
    Distance() {
        feet = 0;
        inches = 0;
    }
    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void display() {
        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + inches);
    }

    public static void main(String[] args) {
        Distance d = new Distance(5, 8);

        d.display();
    }
}
