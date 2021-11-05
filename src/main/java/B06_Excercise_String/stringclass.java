package B06_Excercise_String;

import java.util.Scanner;

public class stringclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sinhVien = new Scanner(System.in);

        System.out.println("nhap vao ho va ten");
        String HovaTen = sinhVien.nextLine();

        System.out.println(firstUpper(HovaTen));
    }
    public static String firstUpper(String chr){
        char[] chars = chr.toLowerCase().toCharArray();
        boolean found = false;

        for(int i = 0; i < chars.length; i++){
            if(!found && Character.isLetter(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            }else if(Character.isWhitespace(chars[i])){
                found = false;
            }
        }
        return String.valueOf(chars);
    }

}
