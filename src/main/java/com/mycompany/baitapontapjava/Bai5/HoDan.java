package com.mycompany.baitapontapjava.Bai5;

import java.util.ArrayList;
import java.util.Scanner;
class HoDan {
    private int soNha_332;
    private ArrayList<Nguoi> dsNguoi_332 = new ArrayList<>();

    public HoDan(int soNha_332) {
        this.soNha_332 = soNha_332;
    }

    public void nhapHoDan(Scanner sc_332) {
        System.out.print("Nhap so thanh vien trong ho: ");
        int soTV_332 = Integer.parseInt(sc_332.nextLine());
        for (int i = 0; i < soTV_332; i++) {
            System.out.println("==> Nhap thong tin thanh vien thu " + (i + 1));
            System.out.print("Ho ten: ");
            String ten_332 = sc_332.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh_332 = Integer.parseInt(sc_332.nextLine());
            System.out.print("Nghe nghiep: ");
            String nghe_332 = sc_332.nextLine();

            dsNguoi_332.add(new Nguoi(ten_332, namSinh_332, nghe_332));
        }
    }

    public boolean coNguoi80Tuoi() {
        for (Nguoi n : dsNguoi_332) {
            if (n.getTuoi() == 80) {
                return true;
            }
        }
        return false;
    }

    public void hienThi() {
        System.out.println("==> Ho so nha: " + soNha_332);
        for (Nguoi n : dsNguoi_332) {
            n.hienThi();
        }
    }
}
