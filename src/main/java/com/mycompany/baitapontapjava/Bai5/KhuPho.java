package com.mycompany.baitapontapjava.Bai5;
import java.util.ArrayList;
import java.util.Scanner;
class KhuPho {
    private ArrayList<HoDan> dsHoDan_350 = new ArrayList<>();

    public void nhapKhuPho() {
        Scanner sc_350 = new Scanner(System.in);
        System.out.print("Nhap so ho dan: ");
        int n_350 = Integer.parseInt(sc_350.nextLine());

        for (int i = 0; i < n_350; i++) {
            System.out.println("\n==> Nhap ho dan thu " + (i + 1));
            System.out.print("Nhap so nha: ");
            int soNha_350 = Integer.parseInt(sc_350.nextLine());

            HoDan ho_350 = new HoDan(soNha_350);
            ho_350.nhapHoDan(sc_350);
            dsHoDan_350.add(ho_350);
        }
    }

    public void hienThiHoCoNguoi80Tuoi() {
        System.out.println("\n===== Cac ho co nguoi 80 tupi =====");
        boolean timThay_350 = false;
        for (HoDan ho : dsHoDan_350) {
            if (ho.coNguoi80Tuoi()) {
                ho.hienThi();
                timThay_350 = true;
            }
        }
        if (!timThay_350) {
            System.out.println("Khong co ho nao co nguoi 80 tuoi.");
        }
    }
}
