package com.mycompany.baitapontapjava.Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HSHocSinh> ds = new ArrayList<>();

        System.out.print("Nhap so hoc sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin hoc sinh thu " + (i + 1));
            HSHocSinh hs = new HSHocSinh();
            hs.nhap(sc);
            ds.add(hs);
        }

        System.out.println("\n=== Hoc sinh sinh nam 1985 va que Thai Nguyen ===");
        for (HSHocSinh hs : ds) {
            if (hs.getNgaySinh().contains("1985") && hs.getQueQuan().equalsIgnoreCase("Thai Nguyen")) {
                hs.hienThi();
                System.out.println("-------------------");
            }
        }

        System.out.println("\n=== Hoc sinh lop 10A1 ===");
        for (HSHocSinh hs : ds) {
            if (hs.getLop().equalsIgnoreCase("10A1")) {
                hs.hienThi();
                System.out.println("-------------------");
            }
        }
    }
}
