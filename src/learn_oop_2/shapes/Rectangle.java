package learn_oop_2.shapes;

class Rectangle extends Shape {

    public Rectangle (int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawing with color: " + color);
    }
}
