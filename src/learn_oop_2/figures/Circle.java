package learn_oop_2.figures;

class Circle extends Shape {

    @Override
    protected void draw() {

    }

    public Circle (int coordinate, String color) {
        this.coordinate = coordinate;
        this.color = color;
    }
}
