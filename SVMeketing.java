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
public class SVMeketing extends SinhVien{
      private float diemMkt;

    public SVMeketing() {
    }

    public SVMeketing(float diemMkt) {
        this.diemMkt = diemMkt;
    }

    public SVMeketing(float diemMkt, String ten, String masv, int namSinh, String chuyennganh, float diem) {
        super(ten, masv, namSinh, chuyennganh, diem);
        this.diemMkt = diemMkt;
    }

    public float getDiemMkt() {
        return diemMkt;
    }

    public void setDiemMkt(float diemMkt) {
        this.diemMkt = diemMkt;
    }
         @Override
   public void nhap(){
   super.nhap();
    Scanner sc = new Scanner(System.in);
         System.out.println("Nhập điểm Maketing: ");
         diemMkt=Float.parseFloat(sc.nextLine());
   }
     @Override
   public float diemTB(){
       float tinhDiem=(diemMkt + getDiem()) / 2;
       return tinhDiem;
   }
      

   
}
