package com.mycompany.baitapontapjava.Bai5;
import java.util.ArrayList;
import java.util.Scanner;
class KhuPho {
    private ArrayList<HoDan> dsHoDan_332 = new ArrayList<>();

    public void nhapKhuPho() {
        Scanner sc_332 = new Scanner(System.in);
        System.out.print("Nhap so ho dan: ");
        int n_332 = Integer.parseInt(sc_332.nextLine());

        for (int i = 0; i < n_332; i++) {
            System.out.println("\n==> Nhap ho dan thu " + (i + 1));
            System.out.print("Nhap so nha: ");
            int soNha_332 = Integer.parseInt(sc_332.nextLine());

            HoDan ho_332 = new HoDan(soNha_332);
            ho_332.nhapHoDan(sc_332);
            dsHoDan_332.add(ho_332);
        }
    }

    public void hienThiHoCoNguoi80Tuoi() {
        System.out.println("\n===== Cac ho co nguoi 80 tupi =====");
        boolean timThay_332 = false;
        for (HoDan ho : dsHoDan_332) {
            if (ho.coNguoi80Tuoi()) {
                ho.hienThi();
                timThay_332 = true;
            }
        }
        if (!timThay_332) {
            System.out.println("Khong co ho nao co nguoi 80 tuoi.");
        }
    }
}
