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
    menu tìm sv có từng điểm cao nhất
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
        }

        System.out.println("==========================================");
        for(int i = 0; i < SoluongSV; i++){
            if(avg[i] >= 8){
                System.out.println(TenSV[i]+" "+LopSV[i]+" Hoc Sinh Gioi \n"+avg[i]);
            }else if(avg[i] < 8 && avg[i] >= 6.5){
                System.out.println(TenSV[i]+" "+LopSV[i]+" Hoc Sinh Kha \n"+avg[i]);
            }else if(avg[i] < 6.5 && avg[i] >=5){
                System.out.println(TenSV[i]+" "+LopSV[i]+" Hoc Sinh Trung Binh \n"+avg[i]);
            }else{
                System.out.println(TenSV[i]+" "+LopSV[i]+" Hoc Sinh Yeu \n"+avg[i]);
            }

        }

        float max = avg[0];
        float min = avg[0];
        String maxStudent = TenSV[0];
        String minStudent = TenSV[0];
        for(int i = 0; i < SoluongSV; i++){
            if(max < avg[i]){
                max = avg[i];
                maxStudent = TenSV[i];
            }else if(min > avg[i]){
                min = avg[i];
                minStudent = TenSV[i];
            }
        }

        float maxChemistry = DiemHoaSV[0];
        float minChemintry = DiemHoaSV[0];
        String maxStudentChemiStry = TenSV[0];
        String minStudentChemiStry = TenSV[0];
        for(int i = 0; i < SoluongSV; i++){
            if(maxChemistry < DiemHoaSV[i]){
                maxChemistry = DiemHoaSV[i];
                maxStudentChemiStry = TenSV[i];
            }else if(minChemintry > DiemHoaSV[i]){
                minChemintry = DiemHoaSV[i];
                minStudentChemiStry = TenSV[i];
            }
        }

        float maxLiterature = DiemLySV[0];
        float minLiterature = DiemLySV[0];
        String maxStudentLiterature = TenSV[0];
        String minStudentLiterature = TenSV[0];
        for(int i = 0; i < SoluongSV; i++){
            if(maxLiterature < DiemLySV[i]){
                maxLiterature = DiemLySV[i];
                maxStudentLiterature = TenSV[i];
            }else if(minLiterature > DiemLySV[i]){
                minLiterature = DiemLySV[i];
                minStudentLiterature = TenSV[i];
            }
        }

        float maxMath = DiemToanSV[0];
        float minMath = DiemToanSV[0];
        String maxStudentMath = TenSV[0];
        String minStudentMath = TenSV[0];
        for(int i = 0; i < SoluongSV; i++){
            if(maxMath < DiemToanSV[i]){
                maxMath = DiemToanSV[i];
                maxStudentMath = TenSV[i];
            }else if(minMath > DiemToanSV[i]){
                minMath = DiemToanSV[i];
                minStudentMath = TenSV[i];
            }
        }
        System.out.println("==========================================");

        System.out.println("Student Menu");
        System.out.println("Choose a number:");
        System.out.println(" ");
        System.out.println("1. Max and Min average student point");
        System.out.println("2. Max and Min Chemistry Student point");
        System.out.println("3. Max and Min Literature Student point");
        System.out.println("4. Max and Min Math Student point");
        byte Menu = SinhVien.nextByte();
        switch (Menu){
            case 1:{
                System.out.println("Student \""+maxStudent+"\" have a highest point: "+max);
                System.out.println("Student \""+minStudent+"\" have a lowest point: "+min);
            }
                break;
            case 2:{
                System.out.println("Student \""+maxStudentChemiStry+"\" have a highest point: "+maxChemistry);
                System.out.println("Student \""+minStudentChemiStry+"\" have a lowest point: "+minChemintry);
            }
                break;
            case 3:{
                System.out.println("Student \""+maxStudentLiterature+"\" have a highest point: "+maxLiterature);
                System.out.println("Student \""+minStudentLiterature+"\" have a lowest point: "+minLiterature);
            }
                break;
            case 4:{
                System.out.println("Student \""+maxStudentMath+"\" have a highest point: "+maxMath);
                System.out.println("Student \""+minStudentMath+"\" have a lowest point: "+minMath);
            }
                break;
            default:break;
        }
    }
}
