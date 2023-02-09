package learn_oop_2.shapes;

class Circle extends Shape {

    public Circle(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawing with color: " + color);
    }
}
