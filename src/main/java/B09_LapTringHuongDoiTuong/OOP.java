package B09_LapTringHuongDoiTuong;

import java.util.Scanner;

public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



//        Car myCar = new Car();
//
//        myCar.color = "white";
//        myCar.weight = 60.7f;
//        System.out.println(myCar.color);
//        System.out.println(myCar.weight);
//
//        myCar.run();
//        myCar.brake();
//
//        motoCycle myMotor = new motoCycle();
//        myMotor.input();
        Scanner InputRectangle = new Scanner(System.in);
        System.err.println("input length and width");
        int length = InputRectangle.nextInt();
        InputRectangle.nextLine();
        int width = InputRectangle.nextInt();
        Rectangle myRectangle = new Rectangle();

        myRectangle.input(length, width);
        myRectangle.caculate();

    }

}

class Rectangle{
    int length;
    int width;

    void input(int length, int width){
        this.length = length;
        this.width = width;

        System.out.println("Length.Rectagle: "+length+" | Width.Rectangle: "+width);

    }
    public void caculate(){
        System.out.println("Area.Rectangle: ");
        System.out.println(length * width);

        System.out.println("Perimeter.Rectangle: ");
        System.out.println((length + width)*2);
    }
}
//class Car {
//    String color;
//    int number;
//    float weight;
//    float height;
//
//    public void run(){
//        System.out.println("Running...");
//    }
//    public void brake(){
//        System.err.println("Braking...");
//    }
//}
//class motoCycle{
//    String name;
//    String cycleCode;
//    String color;
//
//    float maxSpd;
//    float weight;
//    float height;
//
//
//    public void input(){
//        Scanner getIn = new Scanner(System.in);
//        System.out.println("input your motor Name, Code, Color, Max Speed, Weight, Height:");
//        System.err.println("=============");
//
//        String Name = getIn.nextLine();
//        String Code = getIn.nextLine();
//        String Color = getIn.nextLine();
//
//        float MaxSpd = getIn.nextFloat();
//        getIn.nextLine();
//        float weight = getIn.nextFloat();
//        getIn.nextLine();
//        float height = getIn.nextFloat();
//
//        System.err.println("=============");
//
//        System.out.println("Name: "+Name+"| Code: "+Code+"| Color: "+Color+"| Max Speed: "+MaxSpd+"| Weight: "+weight+"| Height: "+height);
//    }
//}


