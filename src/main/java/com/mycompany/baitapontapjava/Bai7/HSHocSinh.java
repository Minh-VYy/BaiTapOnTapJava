package com.mycompany.baitapontapjava.Bai7;

import java.util.Scanner;
class HSHocSinh extends Nguoi {
    private String lop_332;
    private String khoaHoc_332;
    private String kyHoc_332;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop: ");
        lop_332 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_332 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_332 = sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop_332);
        System.out.println("Khoa hoc: " + khoaHoc_332);
        System.out.println("Ky hoc: " + kyHoc_332);
    }

    public String getLop() {
        return lop_332;
    }
}