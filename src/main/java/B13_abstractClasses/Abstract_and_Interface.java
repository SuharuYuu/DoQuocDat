package B13_abstractClasses;

import java.util.Scanner;

interface bank{
    double rateUp();
}
abstract class Customer{
    abstract void showInfo();
}
class VCB extends Customer implements bank{

    @Override
    void showInfo() {
        System.out.println("DQD");
    }

    @Override
    public double rateUp() {
        return 5.5;
    }
}
class ABB extends Customer implements bank {

    @Override
    void showInfo() {
        Scanner users = new Scanner(System.in);

        System.out.println("Ho va ten:");
        String name = users.nextLine();
        System.out.println("So du");
        double cash = users.nextDouble();
    }

    @Override
    public double rateUp() {
        return 3;
    }

}

public class Abstract_and_Interface {


    public static void main(String[] args) {
        VCB nganHang = new VCB();
        ABB abb = new ABB();

        nganHang.showInfo();
        abb.showInfo();
        System.out.println(abb.rateUp());
        System.out.println(nganHang.rateUp());
    }

}
