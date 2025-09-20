package com.mycompany.baitapontapjava.Bai10;
import java.util.Scanner;
class BienLai {
    private KhachHang khachHang_350;
    private int chiSoCu_350;
    private int chiSoMoi_350;
    private double soTien_350;

    public void nhap(Scanner sc) {
        khachHang_350 = new KhachHang();
        System.out.println("\n=== Nhap thong tin khach hang ===");
        khachHang_350.nhap(sc);

        System.out.print("Nhap chi so cu: ");
        chiSoCu_350 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_350 = Integer.parseInt(sc.nextLine());

        tinhTien();
    }

    private void tinhTien() {
        soTien_350 = (chiSoMoi_350 - chiSoCu_350) * 750;
    }

    public void hienThi() {
        khachHang_350.hienThi();
        System.out.println("Chi so cu: " + chiSoCu_350);
        System.out.println("Chi so moi: " + chiSoMoi_350);
        System.out.println("So tien phai tra: " + soTien_350 + " VND");
    }
}