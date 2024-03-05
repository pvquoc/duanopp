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
public class Menu {

    public static void menu() {
        System.out.println("\n==================== Menu chuong trinh ======================");
        System.out.println("| 1. Nhap danh sach sinh vien                               |");
        System.out.println("| 2. Xuat danh sach sinh vien                                 |");
        System.out.println("| 3. Tim sinh vien theo ma sinh vien                          |");
        System.out.println("| 4. Xoa sinh vien theo ma sinh vien                         |");
        System.out.println("| 5. Cap nhat thong tin sinh vien theo ma sinh vien          |");
        System.out.println("| 6. Xuat sinh vien theo khoang diem                        |");
        System.out.println("| 7. Sap xep sinh vien theo ho va ten                        |");
        System.out.println("| 8. Sap xep sinh vien theo diem                         |");
        System.out.println("| 9. Xuat 5 sinh vien co diem cao nhat                   |");
        System.out.println("| 0. Thoat                                                   |");
        System.out.println("==============================================================");
        System.out.print("Moi ban chon: ");
    }

    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");
        QLSinhVien ql = new QLSinhVien();

        ql.list.add(new SinhVien("Quoc", "PH1", 2004, "Sinh Vien", 8));
        ql.list.add(new SVCNTT(9, "Quoc 2", "PH2", 2005, "CNTT", 9));
        ql.list.add(new SVCoKhi(8, "Quoc 3", "PH3", 2006, "Co Khi", 7));
        ql.list.add(new SVMeketing(7, "Quoc 4", "PH4", 2007, "Marketing", 9));
        ql.list.add(new SVPR(6,9, "Quoc 5", "PH5", 2008, "Quan He Cong Chung", 8));
        int option;
        while (true) {            
            Scanner sc =new Scanner(System.in);
            menu();
            option=Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhap Danh Sach siinh vien");
                    ql.nhapThongTin();
                    break;
                        case 2:
                    System.out.println("Danh Sach siinh vien");
                    ql.xuatThongTin();
                    break;
                        case 3:
                    ql.findID();
                    break;
                          case 4:
                    ql.deleteID();
                    break;
                          case 5:
                    ql.updateID();
                    break;
                          case 6:
                    ql.xuatSVtheodiem();
                    break;
                          case 7:
                    ql.xuattheoten();
                    break;
                          case 8:
                    ql.sapXeptheodiem();
                    break;
                          case 9:
                    ql.top5DiemCao();
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
}
