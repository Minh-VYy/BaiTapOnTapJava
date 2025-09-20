package com.mycompany.baitapontapjava.Bai5;

import java.util.ArrayList;
import java.util.Scanner;
class HoDan {
    private int soNha_350;
    private ArrayList<Nguoi> dsNguoi_350 = new ArrayList<>();

    public HoDan(int soNha_350) {
        this.soNha_350 = soNha_350;
    }

    public void nhapHoDan(Scanner sc_350) {
        System.out.print("Nhap so thanh vien trong ho: ");
        int soTV_350 = Integer.parseInt(sc_350.nextLine());
        for (int i = 0; i < soTV_350; i++) {
            System.out.println("==> Nhap thong tin thanh vien thu " + (i + 1));
            System.out.print("Ho ten: ");
            String ten_350 = sc_350.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh_350 = Integer.parseInt(sc_350.nextLine());
            System.out.print("Nghe nghiep: ");
            String nghe_350 = sc_350.nextLine();

            dsNguoi_350.add(new Nguoi(ten_350, namSinh_350, nghe_350));
        }
    }

    public boolean coNguoi80Tuoi() {
        for (Nguoi n : dsNguoi_350) {
            if (n.getTuoi() == 80) {
                return true;
            }
        }
        return false;
    }

    public void hienThi() {
        System.out.println("==> Ho so nha: " + soNha_350);
        for (Nguoi n : dsNguoi_350) {
            n.hienThi();
        }
    }
}
