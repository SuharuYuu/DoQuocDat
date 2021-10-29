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

        System.out.println("Number of Student:");
        int SoluongSV = SinhVien.nextInt();
        SinhVien.nextLine();


        String[] TenSV = new String[SoluongSV];
        byte[] TuoiSV = new byte[SoluongSV];
        String[] LopSV = new String[SoluongSV];
        float[] DiemToanSV = new float[SoluongSV];
        float[] DiemLySV = new float[SoluongSV];
        float[] DiemHoaSV = new float[SoluongSV];
        float[] avg = new float[SoluongSV];

        for(int i = 0; i < SoluongSV ; i++){
            System.out.println("Enter Name, Age, Class");
            TenSV[i] = SinhVien.nextLine();

            TuoiSV[i] = SinhVien.nextByte();
            SinhVien.nextLine();

            LopSV[i] = SinhVien.nextLine();

            System.out.println("Enter Point of Math, Literature, Chemistry");
            DiemToanSV[i] = SinhVien.nextFloat();
            DiemLySV[i] = SinhVien.nextFloat();
            DiemHoaSV[i] = SinhVien.nextFloat();
            SinhVien.nextLine();
            avg[i] = (DiemHoaSV[i] + DiemLySV[i] + DiemHoaSV[i])/3;
            if(avg[i] >= 8){
                System.out.println("Hoc Sinh Gioi \n" + avg[i]);
            }else if(avg[i] < 8 && avg[i] >= 6.5){
                System.out.println("Hoc Sinh Kha \n" + avg[i]);
            }else if(avg[i] < 6.5 && avg[i] >=5){
                System.out.println("Hoc Sinh Trung Binh \n" + avg[i]);
            }else{
                System.out.println("Hoc Sinh Yeu \n" + avg[i]);
            }
        }
        float max = avg[0];
        String maxStudent = TenSV[0];
        for(int i = 0; i < SoluongSV; i++){
            if(max < avg[i]){
                max = avg[i];
                maxStudent = TenSV[i];
            }
        }
        System.out.println("Student \""+maxStudent+"\" have a highest point: "+max);
    }
}
