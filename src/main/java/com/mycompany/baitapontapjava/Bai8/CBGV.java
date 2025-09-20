package com.mycompany.baitapontapjava.Bai8;

import java.util.Scanner;
class CBGV extends Nguoi {
    private double luongCung_350;
    private double thuong_350;
    private double phat_350;
    private double luongThucLinh_350;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_350 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong_350 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat_350 = Double.parseDouble(sc.nextLine());
        tinhLuong();
    }

    private void tinhLuong() {
        luongThucLinh_350 = luongCung_350 + thuong_350 - phat_350;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_350);
        System.out.println("Thuong: " + thuong_350);
        System.out.println("Phat: " + phat_350);
        System.out.println("Luong thuc linh: " + luongThucLinh_350);
    }

    public double getLuongThucLinh() {
        return luongThucLinh_350;
    }
}