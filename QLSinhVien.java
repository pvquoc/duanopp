/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanopp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author phamvanquoc2k4
 */
public class QLSinhVien {

    ArrayList<SinhVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("Moi Ban Nhap so sinh viên: ");
        System.out.println("1-SV IT 2-SV co khi 3-SV Marketing 4-SV Quan he cong chung");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                SinhVien sv = new SinhVien();
                sv.nhap();
                sv.setChuyennganh("Sinh Vien");
                list.add(sv);
                break;
            case 2:
                SVCNTT it = new SVCNTT();
                it.nhap();
                it.setChuyennganh("CNTT");
                list.add(it);
                break;
            case 3:
                SVCoKhi ck = new SVCoKhi();
                ck.nhap();
                ck.setChuyennganh("Co Khi");
                list.add(ck);
                break;
            case 4:
                SVMeketing mkt = new SVMeketing();
                mkt.nhap();
                mkt.setChuyennganh("Marketing");
                list.add(mkt);
                break;
            case 5:
                SVPR pr = new SVPR();
                pr.nhap();
                pr.setChuyennganh("Quan He Cong Chung");
                list.add(pr);
                break;
            default:
                System.out.println("Chọn lại");
                break;
        }
    }

    public void xuatThongTin() {

        System.out.println("| ma  |  ten  |  namsinh  |  chuyennganh  |  diem  |  diemTB|");
        for (SinhVien sinhVien : list) {
            System.out.printf("| %-10s | %-24s | %-20s | %-30s | %-10.2f | %-8.2f|\n",
                    sinhVien.getMasv(), sinhVien.getTen(), sinhVien.getNamSinh(), sinhVien.getChuyennganh(), sinhVien.getDiem(), sinhVien.diemTB()
            );
        }
        System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
    }

    public void findID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã cần tìm: ");
        String id = sc.nextLine();
           Boolean check = false;
        for (SinhVien sinhVien : list) {
            if (sinhVien.getMasv().toLowerCase().contains(id.toLowerCase())) {
                System.out.println("| ma  |  ten  |  namsinh  |  chuyennganh  |  diem  |  diemTB|");
                System.out.printf("| %-10s | %-24s | %-20s | %-30s | %-10.2f | %-8.2f|\n",
                        sinhVien.getMasv(), sinhVien.getTen(), sinhVien.getNamSinh(), sinhVien.getChuyennganh(), sinhVien.getDiem(), sinhVien.diemTB()
                );
                System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
                check=true;
                break;
            }
        }
           if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        }
    }
    public void deleteID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma cac xoa: ");
        String id =sc.nextLine();
          Boolean check = false;
        for(SinhVien sv: list){
            if(id.equalsIgnoreCase(sv.getMasv())){
                list.remove(sv);
                check=true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }
    
    public void updateID(){
        System.out.println("Nhap ma can cap nhap: ");
        String id = sc.nextLine();
        
        for(SinhVien sv : list){
            if(sv.getMasv().equalsIgnoreCase(id)){
                System.out.println("+++Cap nhap lai thong tin+++");
                sv.nhap();
            }
        }
        xuatThongTin();
    }
    public void xuatSVtheodiem(){
        System.out.println("Xuat danh sach sinh vien theo diem");
        System.out.println("diem nho: ");
        double min=sc.nextDouble();
        System.out.println("Diem lon: ");
        double max=sc.nextDouble();
        for(SinhVien sv : list){
            if(sv.getDiem() >= min && sv.getDiem() <= max){
                sv.xuat();
            }
        }
    }
    public void xuattheoten(){
        Comparator<SinhVien> name =new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(list,name);
        xuatThongTin();
    }
    public void sapXeptheodiem(){
        Comparator diem =new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.diemTB()>o2.diemTB()){
                    return 1;
                }else{
                    return -1;
                }
            }            
        };
        Collections.sort(list,diem);
        xuatThongTin();
    }
    
    public void top5DiemCao(){
        Collections.sort(list, (a, b) -> (int) (b.diemTB()- a.diemTB()));
        if(list.size()<5){
            for(int i=0;i<list.size();i++){
                list.get(i).xuat();
            }
        }else{
            for(int i=0;i<5;i++){
                list.get(i).xuat();
            }
        }
    }

}
