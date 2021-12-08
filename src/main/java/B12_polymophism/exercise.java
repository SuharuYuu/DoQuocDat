
package B12_polymophism;

import java.util.ArrayList;
import java.util.List;
public class exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle0 honda0 = new Honda0();
        Vehicle0 toyota0 = new Toyota0();
        Vehicle0 yama0 = new Yama0();


        Vehicle0[] arr = new Vehicle0[5];

        arr[0] = toyota0;
        arr[1] = new Toyota0();
        arr[2] = new Honda0();
        arr[3] = yama0;
        arr[4] = new Yama0();

        for(int i = 0; i < 5; i++){
            if(arr[i] instanceof Toyota0){
                ((Toyota0) arr[i]).Other();
            }else{
                arr[i].showInfoArr();
            }
        }
        System.out.println("===============");
        List<Vehicle0> list = new ArrayList<>();
        list.add(yama0);
        list.add(new Toyota0());
        list.add(new Honda0());
        for(var array : list){
            array.showInfoArr();
        }


    }

}

class Vehicle0{
    void showInfoArr(){

    }
}
class Toyota0 extends Vehicle0 {
    @Override // annotations
    void showInfoArr(){
        System.out.println("Toyota");
    }
    void Other(){
        System.out.println("Other Toyota");
    }
}

class Honda0 extends Vehicle0 {
    void showInfoArr(){
        System.out.println("Honda");
    }
}

class Yama0 extends Vehicle0 {
    void showInfoArr(){
        System.out.println("Yama");
    }
}


