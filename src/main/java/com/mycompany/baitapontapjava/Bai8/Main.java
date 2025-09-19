package com.mycompany.baitapontapjava.Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CBGV> ds = new ArrayList<>();

        System.out.print("Nhap so luong can bo giao vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin CBGV thu " + (i + 1));
            CBGV cb = new CBGV();
            cb.nhap(sc);
            ds.add(cb);
        }

        System.out.println("\n=== Danh sach tat ca CBGV ===");
        for (CBGV cb : ds) {
            cb.hienThi();
            System.out.println("-------------------");
        }

        System.out.println("\n=== Danh sach CBGV co luong >= 8,000,000 ===");
        for (CBGV cb : ds) {
            if (cb.getLuongThucLinh() >= 8000000) {
                cb.hienThi();
                System.out.println("-------------------");
            }
        }
    }
}
