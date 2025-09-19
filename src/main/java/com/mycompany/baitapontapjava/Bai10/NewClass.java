package com.mycompany.baitapontapjava.Bai10;
import java.util.Scanner;
class BienLai {
    private KhachHang khachHang_332;
    private int chiSoCu_332;
    private int chiSoMoi_332;
    private double soTien_332;

    public void nhap(Scanner sc) {
        khachHang_332 = new KhachHang();
        System.out.println("\n=== Nhap thong tin khach hang ===");
        khachHang_332.nhap(sc);

        System.out.print("Nhap chi so cu: ");
        chiSoCu_332 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_332 = Integer.parseInt(sc.nextLine());

        tinhTien();
    }

    private void tinhTien() {
        soTien_332 = (chiSoMoi_332 - chiSoCu_332) * 750;
    }

    public void hienThi() {
        khachHang_332.hienThi();
        System.out.println("Chi so cu: " + chiSoCu_332);
        System.out.println("Chi so moi: " + chiSoMoi_332);
        System.out.println("So tien phai tra: " + soTien_332 + " VND");
    }
}