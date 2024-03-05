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
public class SVPR extends SinhVien{
    private float diemPR;
    private float diemSK;

    public SVPR() {
    }

    public SVPR(float diemPR, float diemSK) {
        this.diemPR = diemPR;
        this.diemSK = diemSK;
    }

    public SVPR(float diemPR, float diemSK, String ten, String masv, int namSinh, String chuyennganh, float diem) {
        super(ten, masv, namSinh, chuyennganh, diem);
        this.diemPR = diemPR;
        this.diemSK = diemSK;
    }

    public float getDiemPR() {
        return diemPR;
    }

    public void setDiemPR(float diemPR) {
        this.diemPR = diemPR;
    }

    public float getDiemSK() {
        return diemSK;
    }

    public void setDiemSK(float diemSK) {
        this.diemSK = diemSK;
    }
         @Override
   public void nhap(){
   super.nhap();
    Scanner sc = new Scanner(System.in);
         System.out.println("Nhập điểm PR: ");
         diemPR=Float.parseFloat(sc.nextLine());
             System.out.println("Nhập điểm sự kiện: ");
         diemSK=Float.parseFloat(sc.nextLine());
   }
     @Override
   public float diemTB(){
       float tinhDiem= (float) ((diemPR + getDiem())  / 2 + (diemSK * 0.2));
       return tinhDiem;
   }
    
}
