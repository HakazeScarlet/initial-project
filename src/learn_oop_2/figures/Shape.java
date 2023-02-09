package learn_oop_2.figures;

abstract class Shape {

    protected String color;
    protected int coordinate;

    abstract public void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

}
