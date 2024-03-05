/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanopp;

import java.util.Scanner;

/**
 *
 * @author phamvanquoc2k4
 */
public class SVCNTT extends SinhVien{
     private float diemCntt;

    public SVCNTT() {
    }

    public SVCNTT(float diemCntt) {
        this.diemCntt = diemCntt;
    }

    public SVCNTT(float diemCntt, String ten, String masv, int namSinh, String chuyennganh, float diem) {
        super(ten, masv, namSinh, chuyennganh, diem);
        this.diemCntt = diemCntt;
    }

    public double getDiemCntt() {
        return diemCntt;
    }

    public void setDiemCntt(float diemCntt) {
        this.diemCntt = diemCntt;
    }

     @Override
   public void nhap(){
   super.nhap();
    Scanner sc = new Scanner(System.in);
         System.out.println("Nhập điểm CNTT: ");
         diemCntt=Float.parseFloat(sc.nextLine());
   }
     @Override
   public float diemTB(){
       float tinhDiem=(diemCntt + getDiem()) / 2;
       return tinhDiem;
   }
}
