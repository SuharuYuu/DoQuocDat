package B12_polymophism;

public class RuntimePolymophism {
    public static void main(String[] args) {

        Vehicle toyota = new Toyota();
        toyota.showInfo();

        Vehicle honda = new Honda();
        honda.showInfo();

        Vehicle yama = new Yama();
        yama.showInfo();
    }

}

class Vehicle{
    void showInfo(){
        System.out.println("Vehicle");
    }
}

class Toyota extends Vehicle {
    @Override // annotations
    void showInfo(){
        System.out.println("Toyota");
    }
}

class Honda extends Vehicle {
    void showInfo(){
        System.out.println("Honda");
    }
}

class Yama extends Vehicle {
    void showInfo(){
        System.out.println("Yama");
    }
}
