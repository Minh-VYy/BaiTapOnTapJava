package com.mycompany.baitapontapjava.Bai8;

import java.util.Scanner;
class CBGV extends Nguoi {
    private double luongCung_332;
    private double thuong_332;
    private double phat_332;
    private double luongThucLinh_332;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_332 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong_332 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat_332 = Double.parseDouble(sc.nextLine());
        tinhLuong();
    }

    private void tinhLuong() {
        luongThucLinh_332 = luongCung_332 + thuong_332 - phat_332;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_332);
        System.out.println("Thuong: " + thuong_332);
        System.out.println("Phat: " + phat_332);
        System.out.println("Luong thuc linh: " + luongThucLinh_332);
    }

    public double getLuongThucLinh() {
        return luongThucLinh_332;
    }
}