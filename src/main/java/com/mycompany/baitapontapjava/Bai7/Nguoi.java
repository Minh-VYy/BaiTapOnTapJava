package com.mycompany.baitapontapjava.Bai7;

import java.util.Scanner;
class Nguoi {
    protected String hoTen_332;
    protected String ngaySinh_332;
    protected String queQuan_332;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_332 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_332 = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan_332 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_332);
        System.out.println("Ngay sinh: " + ngaySinh_332);
        System.out.println("Que quan: " + queQuan_332);
    }

    public String getNgaySinh() {
        return ngaySinh_332;
    }

    public String getQueQuan() {
        return queQuan_332;
    }
}

