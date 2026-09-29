class Marks {
    int mark1;
    int mark2;
    int mark3;
    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }
    Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculateSum() {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {
        Marks m = new Marks(80, 75, 90);

        System.out.println("Sum = " + m.calculateSum());
    }
}