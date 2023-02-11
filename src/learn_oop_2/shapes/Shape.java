package learn_oop_2.shapes;

abstract class Shape {

    protected final int x;
    protected final int y;
    protected String color;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
