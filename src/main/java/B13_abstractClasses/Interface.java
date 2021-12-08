package B13_abstractClasses;

interface Line {
    //fields
    //public static final là mặc định
    /*
    VD:
    double x = 1;
    giống với
    public static final double x = 1;
    */
    public static final double pi = 3.14;

    //methods
    //public abstract là mặc định
    public abstract void draw();
}

class Rece implements Line {

    @Override
    public void draw() {
        System.out.println("Rec");
    }

}

public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Line rectangle = new Rece();
        rectangle.draw();
    }

}
