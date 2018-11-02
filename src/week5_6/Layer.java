package week5_6;


public class Layer  {

    private
    Shape[] x;
    public Layer() {
        x = new Shape[10];
        x[0] = new Circle(100, 50, 100);
        x[1] = new Circle(100, 0, 0);
        x[2] = new Circle(50, 300, 500);
        x[3] = new Circle(100, 0, 100);
        x[4] = new Circle(200, 500, 100);
        x[5] = new Circle(150, 100, 0);
        x[6] = new Triangle();
        x[7] = new Triangle();
        x[8] = new Rectangle();
        x[9] = new Square();
    }

    public void delTriangle() {
        int n=0;
        for (int i = 0; i < 10; i++) {
            if (x[i] instanceof Triangle) {
                x[i] = new Shape();
                n++;
            }
        }
        System.out.println("deleted "+ n+" Triangle");
    }

    public void delCircle() {
        int n=0;
        for (int i = 0; i < 10; i++) {
            if (x[i] instanceof Circle) {
                n++;
                x[i] = new Shape();
            }
        }
        System.out.println("deleted "+ n+" Circle");
    }

    public static void main(String[] args) {
        Layer lay = new Layer();
        lay.delCircle();
        lay.delTriangle();
    }
}