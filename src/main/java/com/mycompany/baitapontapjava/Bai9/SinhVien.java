
package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class SinhVien {
    private String hoTen_332;
    private String maSV_332;
    private String ngaySinh_332;
    private String lop_332;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_332 = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        maSV_332 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_332 = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop_332 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_332);
        System.out.println("Ma SV: " + maSV_332);
        System.out.println("Ngay sinh: " + ngaySinh_332);
        System.out.println("Lop: " + lop_332);
    }

    public String getHoTen() {
        return hoTen_332;
    }
}
