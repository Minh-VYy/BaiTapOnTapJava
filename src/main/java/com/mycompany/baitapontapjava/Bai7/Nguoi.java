package com.mycompany.baitapontapjava.Bai7;

import java.util.Scanner;
class Nguoi {
    protected String hoTen_350;
    protected String ngaySinh_350;
    protected String queQuan_350;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_350 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_350 = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan_350 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_350);
        System.out.println("Ngay sinh: " + ngaySinh_350);
        System.out.println("Que quan: " + queQuan_350);
    }

    public String getNgaySinh() {
        return ngaySinh_350;
    }

    public String getQueQuan() {
        return queQuan_350;
    }
}

