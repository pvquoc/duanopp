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
public class SinhVien {
        private String masv;
    private String ten;
    private float namSinh;
    private String chuyennganh;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String masv, int namSinh, String chuyennganh, float diem) {
        this.ten = ten;
        this.masv = masv;
        this.namSinh = namSinh;
        this.chuyennganh = chuyennganh;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public float getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(float namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void nhap(){
        System.out.println("Nhập thông tin sinh viên");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập mã: ");
        masv=sc.nextLine();
        System.out.println("Nhập tên: ");
        ten=sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh=sc.nextInt();
        System.out.println("Nhập điểm: ");
        diem=sc.nextFloat();
    }
    public float diemTB(){
        return diem;
    }
    public void xuat(){
        System.out.println("| ma  |  ten  |  namsinh  |  chuyennganh  |  diem  |  diemTB|");
        System.out.printf("| %-10s | %-24s | %-20s | %-30s | %-10.2f | %-8.2f|\n",
                getMasv(),getTen(),getNamSinh(),getChuyennganh(),getDiem(),diemTB()
                );
                System.out.printf("%-20s %-20s %-20s %-20s %n", "", "", "", "");
    }
        private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    
    
    
}
