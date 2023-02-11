package learn_oop_2.shapes;

class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2, 3, "red");
        shapes[1] = new Rectangle(5, 2, "black");

        for (int index = 0; index < shapes.length; index++) {
            shapes[index].draw();
        }
    }
}
