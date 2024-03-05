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
public class SVCoKhi extends SinhVien{
    private float diemCoKhi;

    public SVCoKhi() {
    }

    public SVCoKhi(float diemCoKhi) {
        this.diemCoKhi = diemCoKhi;
    }

    public SVCoKhi(float diemCoKhi, String ten, String masv, int namSinh, String chuyennganh, float diem) {
        super(ten, masv, namSinh, chuyennganh, diem);
        this.diemCoKhi = diemCoKhi;
    }

    public float getDiemCoKhi() {
        return diemCoKhi;
    }

    public void setDiemCoKhi(float diemCoKhi) {
        this.diemCoKhi = diemCoKhi;
    }
    

     @Override
   public void nhap(){
   super.nhap();
    Scanner sc = new Scanner(System.in);
         System.out.println("Nhập điểm cơ khí: ");
         diemCoKhi=Float.parseFloat(sc.nextLine());
   }
     @Override
   public float diemTB(){
       float tinhDiem=(diemCoKhi + getDiem()) / 2;
       return tinhDiem;
   }   
}
