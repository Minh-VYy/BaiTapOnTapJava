package com.mycompany.baitapontapjava.Bai10;
import java.util.Scanner;
class KhachHang {
    private String hoTenChuHo_350;
    private String soNha_350;
    private String maCongTo_350;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTenChuHo_350 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha_350 = sc.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo_350 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten chu ho: " + hoTenChuHo_350);
        System.out.println("So nha: " + soNha_350);
        System.out.println("Ma cong to: " + maCongTo_350);
    }
}
