package B04_String_Input_Output;

import java.util.Scanner;

public class Exercise {


    /*Nhap ho ten, tuoi, lop
    diem toan, ly, hoa
    in ra diem trung binh va xep hang sinh vien
    >=8 gioi
    8>=6.5 kha
    6.5>=5 trung binh
    <5 kem
    tim sv co diem lon nhat
    */
    public static void main(String[] args) {
        Scanner SinhVien = new Scanner(System.in);

        float avg;

        System.out.println("Number of Student:");
        int SoluongSV = SinhVien.nextInt();
        SinhVien.nextLine();
        for(int i = 0; i < SoluongSV ; i++){
            System.out.println("Enter Name");
            String TenSV = SinhVien.nextLine();

            System.out.println("Enter Age");
            byte TuoiSV = SinhVien.nextByte();
            SinhVien.nextLine();
            System.out.println("Enter Class");
            String LopSV = SinhVien.nextLine();

            System.out.println("Enter Point of Math, Literature, Chemistry");
            float DiemToanSV = SinhVien.nextFloat();
            float DiemLySV = SinhVien.nextFloat();
            float DiemHoaSV = SinhVien.nextFloat();
            SinhVien.nextLine();
            avg = (DiemHoaSV + DiemLySV + DiemHoaSV)/3;
            if(avg >= 8){
                System.out.println("Hoc Sinh Gioi \n" + avg);
            }else if(avg < 8 && avg >= 6.5){
                System.out.println("Hoc Sinh Kha \n" + avg);
            }else if(avg < 6.5 && avg >=5){
                System.out.println("Hoc Sinh Trung Binh \n" + avg);
            }else{
                System.out.println("Hoc Sinh Yeu \n" + avg);
            }
        }
        
    }
}
