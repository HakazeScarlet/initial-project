package learn_oop_2.figures;

class Main {

    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[2];
        shapeArr[0] = new Circle(23, "red");
        shapeArr[1] = new Rectangle(12, "black");

        for (int s = 0; s < shapeArr.length; s++) {
            shapeArr[0].draw();
            shapeArr[1].draw();
        }

    }
}
