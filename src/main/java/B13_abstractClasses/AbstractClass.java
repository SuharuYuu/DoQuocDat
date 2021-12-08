package B13_abstractClasses;


import java.util.Scanner;


//abstract base class
abstract class Shape {

    //fields
    float ChieuDai;
    float ChieuRong;
    float CanhHinhVuong;

    //constructors
    public Shape(float ChieuDai, float ChieuRong) {
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }
    public Shape(float CanhHinhVuong) {
        this.CanhHinhVuong = CanhHinhVuong;
    }
    //methods
    abstract void area();

}
class rectangle extends Shape {
    public rectangle(float ChieuDai, float ChieuRong) {
        super(ChieuDai,ChieuRong);
    }
    @Override
    void area(){
        float Srec = ChieuDai* ChieuRong;
        System.out.println("Area of Rectangle: "+Srec);
    }
}

class square extends Shape {
    public square(float CanhHinhVUong){
        super(CanhHinhVUong);
    }
    @Override
    void area(){
        float Square = CanhHinhVuong * CanhHinhVuong;
        System.out.println("Area of Square: "+Square);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        rectangle Rec = new rectangle(4, 6);
        square Square = new square(3);

        Rec.area();
        
        Square.area();
    }
}
