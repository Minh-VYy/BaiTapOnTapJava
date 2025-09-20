
package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class SinhVien {
    private String hoTen_350;
    private String maSV_350;
    private String ngaySinh_350;
    private String lop_350;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_350 = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        maSV_350 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_350 = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop_350 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_350);
        System.out.println("Ma SV: " + maSV_350);
        System.out.println("Ngay sinh: " + ngaySinh_350);
        System.out.println("Lop: " + lop_350);
    }

    public String getHoTen() {
        return hoTen_350;
    }
}
