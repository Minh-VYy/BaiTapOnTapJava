package com.mycompany.baitapontapjava.Bai7;

import java.util.Scanner;
class HSHocSinh extends Nguoi {
    private String lop_350;
    private String khoaHoc_350;
    private String kyHoc_350;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop: ");
        lop_350 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_350 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_350 = sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop_350);
        System.out.println("Khoa hoc: " + khoaHoc_350);
        System.out.println("Ky hoc: " + kyHoc_350);
    }

    public String getLop() {
        return lop_350;
    }
}